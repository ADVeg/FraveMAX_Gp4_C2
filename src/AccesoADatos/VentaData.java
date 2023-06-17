package AccesoADatos;

import Entidades.Cliente;
import Entidades.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Turconi Matías
 */
public class VentaData {
    private Connection con;
    
   public VentaData() {
        con = Conexion.getConexion();
    }
    
     public void registrarVenta(Cliente clien, LocalDate fechaVenta) {
            String query = "INSERT INTO ventas ( cliente, fecha_venta) VALUES ( ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, clien.getIdCliente());
            ps.setDate(2, Date.valueOf(fechaVenta));
            

            ps.executeUpdate();
            System.out.println("Venta registrada correctamente.");
            } catch (SQLException e) {
                Logger.getLogger(VentaData.class.getName()).log(Level.SEVERE,null,e);
            }
     }
     
     public void consultarVentas() {
            String query = "SELECT producto, cliente, fecha_venta FROM ventas";
            try (Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {
                System.out.println("Lista de ventas realizadas:");
       
            while (resultSet.next()) {
                String producto = resultSet.getString("producto");
                String cliente = resultSet.getString("cliente");
                LocalDate fechaVenta = resultSet.getDate("fecha_venta").toLocalDate();

                System.out.println("Producto: " + producto);
                System.out.println("Cliente: " + cliente);
                System.out.println("Fecha de venta: " + fechaVenta);
                System.out.println("--------------------");
            }

            } catch (SQLException e) {
                Logger.getLogger(VentaData.class.getName()).log(Level.SEVERE,null,e);
            }
}
     
    public Venta buscarID(int id){
        Venta venta=null;
        String sql="SELECT * FROM venta WHERE idVenta=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                venta=new Venta();
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setFecha(rs.getDate("fecha").toLocalDate());
                venta.getCliente().setIdCliente(rs.getInt("idCliente"));
            }else{
                System.out.println("Producto no encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return venta;
    }
    
    public List<Venta> venta(){
        List<Venta> venta=new ArrayList<>();
        String sql="SELECT * FROM venta";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Cliente clien=new Cliente();
                clien.setIdCliente(rs.getInt("idCliente"));
                venta.add(new Venta(rs.getInt("idVenta"),rs.getDate("fecha").toLocalDate(),clien));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return venta;
    }
     
}