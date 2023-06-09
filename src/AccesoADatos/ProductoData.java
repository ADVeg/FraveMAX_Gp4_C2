package AccesoADatos;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
        if(this.buscarDescripcion(prod.getDescripcion())==null){
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
                    JOptionPane.showMessageDialog(null, "Producto Cargado");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            }
        }else{
            System.out.println("Producto ya cargado");
            JOptionPane.showMessageDialog(null, "Descripcion Repetida");
        }
    }
    
    public List<Producto> buscarNombre(String nom){
        List<Producto> productos=new ArrayList<>();
        String sql="SELECT * FROM producto WHERE nombre=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, nom);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                productos.add(new Producto(rs.getInt("idProducto"),rs.getString("nombre"),rs.getString("categoria"),rs.getString("descripcion"),rs.getDouble("precioActual"),rs.getInt("stock"),rs.getBoolean("estado")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productos;
    }
    
    public Producto buscarID(int id){
        Producto producto=null;
        String sql="SELECT * FROM producto WHERE idProducto=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
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
    
    public Producto buscarDescripcion(String descrip){
        Producto producto=null;
        String sql="SELECT * FROM producto WHERE descripcion=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, descrip);
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
    
    public List<Producto> buscarCategoria(String categoria){
        List<Producto> productos=new ArrayList<>();
        String sql="SELECT * FROM producto WHERE categoria=? AND estado=true";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, categoria);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                productos.add(new Producto(rs.getInt("idProducto"),rs.getString("nombre"),rs.getString("categoria"),rs.getString("descripcion"),rs.getDouble("precioActual"),rs.getInt("stock"),rs.getBoolean("estado")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productos;
    }
    
    public void bajaProducto(int id){
        String sql="UPDATE producto SET estado=false WHERE idProducto=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            if(ps.executeUpdate()==1){
                System.out.println("Producto dado de baja");
            }else{
                System.out.println("Producto no encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void altaProducto(int id){
        String sql="UPDATE producto SET estado=true WHERE idProducto=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            if(ps.executeUpdate()==1){
                System.out.println("Producto dado de alta");
            }else{
                System.out.println("Producto no encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarProducto(Producto prod){
        String sql="UPDATE producto SET nombre=?, categoria=?, descripcion=?, precioActual=?, stock=?, estado=? WHERE idProducto=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, prod.getNombre());
            ps.setString(2, prod.getCategoria());
            ps.setString(3, prod.getDescripcion());
            ps.setDouble(4, prod.getPrecioActual());
            ps.setInt(5, prod.getStock());
            ps.setBoolean(6, prod.isEstado());
            ps.setInt(7, prod.getIdProducto());
            if(ps.executeUpdate()==1){
                System.out.println("Producto modificado");
            }else{
                System.out.println("Producto no encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Producto> productos(){
        List<Producto> productos=new ArrayList<>();
        String sql="SELECT * FROM producto";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                productos.add(new Producto(rs.getInt("idProducto"),rs.getString("nombre"),rs.getString("categoria"),rs.getString("descripcion"),rs.getDouble("precioActual"),rs.getInt("stock"),rs.getBoolean("estado")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productos;
    }
    
   
}
