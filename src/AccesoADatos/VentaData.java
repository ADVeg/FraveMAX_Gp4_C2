package AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
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
    
     public void registrarVenta(int cliente, LocalDate fechaVenta) {
            String query = "INSERT INTO ventas ( cliente, fecha_venta) VALUES ( ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, cliente);
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
}