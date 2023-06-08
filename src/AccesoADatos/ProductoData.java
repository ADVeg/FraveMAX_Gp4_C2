package AccesoADatos;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vega Alberto
 */
public class ProductoData {
    private Connection con;

    public ProductoData() {
        con=Conexion.getConexion();
    }
    
    public void nuevoProducto(Producto prod){
        if(this.buscarNombre(prod.getNombre())==null){
            String sql="INSERT INTO producto(nombre, categoria, descripcion, precioActual, stock, estado) VALUES (?,?,?,?,?,?)";
            try {
                PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, prod.getNombre());
                ps.setString(2, prod.getCategoria());
                ps.setString(3,prod.getDescripcion());
                ps.setDouble(4, prod.getPrecioActual());
                ps.setInt(5, prod.getStock());
                ps.setBoolean(6, prod.isEstado());
                if(ps.executeUpdate()>=0){
                    System.out.println("Producto Cargado");
//                    JOptionPane.showMessageDialog(null, "Producto Cargado");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            }
        }else{
            System.out.println("Producto ya cargado");
        }
    }
    
    public Producto buscarNombre(String nom){
        Producto producto=null;
        String sql="SELECT * FROM producto WHERE nombre=? AND estado=true";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, nom);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                producto=new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getInt("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
            }else{
                System.out.println("Producto no encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return producto;
    }
}
