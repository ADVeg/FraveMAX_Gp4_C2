package AccesoADatos;

import Entidades.DetalleVenta;
import Entidades.Producto;
import Entidades.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vega Alberto
 */
public class DetalleVentaData {
    private Connection con;

    public DetalleVentaData() {
        con=Conexion.getConexion();
    }
    
    public void nuevoDetalleVenta(DetalleVenta detVent){
        if(buscarIdVenta(detVent.getVenta().getIdVenta())==null){
            String sql="INSERT INTO detalleventa(cantidad, precioVenta, idVenta, idProducto) VALUES (?,?,?,?)";
            try {
                PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, detVent.getCantidad());
                ps.setDouble(2, detVent.getPrecioVenta());
                ps.setInt(3, detVent.getVenta().getIdVenta());
                ps.setInt(4, detVent.getProducto().getIdProducto());
                if(ps.executeUpdate()==1){
                    System.out.println("DetalleVenta Cargado");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DetalleVentaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("DetalleVenta ya cargado");
        }
    }
    
    public DetalleVenta buscarIdVenta(int id){
        DetalleVenta dv=null;
        String sql="SELECT * FROM detalleventa WHERE idVenta=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                dv=new DetalleVenta();
                dv.setIdDetalleVent(rs.getInt("idDetalleVent"));
                dv.setCantidad(rs.getInt("cantidad"));
                dv.setPrecioVenta(rs.getDouble("precioVenta"));
                dv.getVenta().setIdVenta(rs.getInt("idVenta"));
                dv.getProducto().setIdProducto(rs.getInt("idProducto"));
            }else{
                System.out.println("DetalleVenta no encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleVentaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dv;
    }
    
    public DetalleVenta buscarIdProducto(int id){
        DetalleVenta dv=null;
        String sql="SELECT * FROM detalleventa WHERE idProducto=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                dv=new DetalleVenta();
                dv.setIdDetalleVent(rs.getInt("idVenta"));
                dv.setCantidad(rs.getInt("cantidad"));
                dv.setPrecioVenta(rs.getDouble("precioVenta"));
                dv.getVenta().setIdVenta(rs.getInt("idVenta"));
                dv.getProducto().setIdProducto(rs.getInt("idProducto"));
            }else{
                System.out.println("DetalleVenta no encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleVentaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dv;
    }
    
    public DetalleVenta buscarIdDetalleVenta(int id){
        DetalleVenta dv=null;
        String sql="SELECT * FROM detalleventa WHERE idDetalleVent=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                dv=new DetalleVenta();
                dv.setIdDetalleVent(rs.getInt("idVenta"));
                dv.setCantidad(rs.getInt("cantidad"));
                dv.setPrecioVenta(rs.getDouble("precioVenta"));
                dv.getVenta().setIdVenta(rs.getInt("idVenta"));
                dv.getProducto().setIdProducto(rs.getInt("idProducto"));
            }else{
                System.out.println("DetalleVenta no encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleVentaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dv;
    }
    
    public void modificarDetalleVenta(DetalleVenta dv){
        String sql="UPDATE detalleVenta SET cantidad=?, precioVenta=? WHERE idDetalleVent=?";
        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, dv.getCantidad());
                ps.setDouble(2, dv.getPrecioVenta());
                ps.setInt(3, dv.getIdDetalleVent());
                if(ps.executeUpdate()==1){
                    System.out.println("Detalle de venta modificado");
                }else{
                    System.out.println("Detalle de venta no encontrado");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleVentaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarDetalleVentaPorID(int id){
        String sql="DELETE FROM detalleVenta WHERE idDetalleVent=?";
        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, id);
                if(ps.executeUpdate()==1){
                    System.out.println("Detalle de venta eliminado");
                }else{
                    System.out.println("Detalle de venta no encontrado");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleVentaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<DetalleVenta> detallesDeVenta(){
        List<DetalleVenta> detallesV=new ArrayList<>();
        Venta v=null;
        Producto p=null;
        String sql="SELECT * FROM detalleventa";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                p=new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                v=new Venta();
                v.setIdVenta(rs.getInt("idVenta"));
                detallesV.add(new DetalleVenta(rs.getInt("idDetalleVent"),rs.getInt("cantidad"),rs.getDouble("precioVenta"),v,p));
            }
            v=null;
            p=null;
        } catch (SQLException ex) {
            Logger.getLogger(DetalleVentaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return detallesV;
    }
}
