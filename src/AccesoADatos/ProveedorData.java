package AccesoADatos;

import Entidades.Proveedor;
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
 * @author Turconi Matías
 */
public class ProveedorData {
    private Connection con;
    private String sql=null;
    List<Proveedor> proveedores=null;

    public ProveedorData() {
        con = Conexion.getConexion();
    }

    public void nuevoProveedor(Proveedor prov) {
        if(buscarProveedorTelefono(prov.getTelefono())==null){
            sql = "INSERT INTO proveedor (rasonSocial, domicilio, telefono) VALUES (?, ?, ?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, prov.getRasonSocial());
                ps.setString(2, prov.getDomicilio());
                ps.setLong(3, prov.getTelefono());
                ps.executeUpdate();
                System.out.println("Proveedor Cargado");
                JOptionPane.showMessageDialog(null, "Proveedor Cargado");
            } catch (SQLException ex) {
                Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            }
        }else{
            System.out.println("Telefono proveedor repetido");
            JOptionPane.showMessageDialog(null, "Telefono proveedor repetido");
        }
        sql=null;
    }
    
    public Proveedor buscarProveedorTelefono(Long tel){
        Proveedor prov=null;
        sql="SELECT * FROM proveedor WHERE telefono=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, tel);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                prov=new Proveedor();
                prov.setIdProveedor(rs.getInt("idProveedor"));
                prov.setRasonSocial(rs.getString("rasonSocial"));
                prov.setDomicilio(rs.getString("domicilio"));
                prov.setTelefono(rs.getLong("telefono"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorData.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        sql=null;
        return prov;
    }

    public void Modificar(Proveedor prov){
        try {
            String sql = "UPDATE proveedor SET rasonSocial=?, domicilio=?, telefono=?, estado=? WHERE idProveedor = ?";
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, prov.getRasonSocial());
            ps.setString(2, prov.getDomicilio());
            ps.setLong(3, prov.getTelefono());
            ps.setBoolean(4, prov.isEstado());
            ps.setInt(5, prov.getIdProveedor());
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Proveedor modificado");
                JOptionPane.showMessageDialog(null, "Proveedor modificado");
            } else {
                System.out.println("No se encontró proveedor");
                JOptionPane.showMessageDialog(null, "No se encontró proveedor");
            }
        } catch (SQLException e) {
            System.out.println("Error al modificar el proveedor: " + e.getMessage());
        }
    }
    
    public void Baja(int id){
        try {
            String sql = "UPDATE proveedor SET estado=false WHERE idProveedor = ?";
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Proveedor eliminado");
                JOptionPane.showMessageDialog(null, "Proveedor eliminado");
            } else {
                System.out.println("No se encontró proveedor");
                JOptionPane.showMessageDialog(null, "No se encontró proveedor");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar el proveedor: " + e.getMessage());
        }
    }
    
    public List<Proveedor> Proveedores(String txt,boolean bol){
        proveedores=null;
        sql="SELECT * FROM proveedor WHERE rasonSocial LIKE '%"+txt+"%' AND estado=?";
        try {
            proveedores=new ArrayList<>();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, bol);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                proveedores.add(new Proveedor(rs.getInt("idProveedor"),rs.getLong("telefono"),rs.getString("rasonSocial"),rs.getString("domicilio"),rs.getBoolean("estado")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorData.class.getName()).log(Level.SEVERE, null, ex);
        }
        sql=null;
        return proveedores;
    }
    
    public List<Proveedor> ProveedoresTodos(String txt){
        proveedores=null;
        sql="SELECT * FROM proveedor WHERE rasonSocial LIKE '%"+txt+"%'";
        try {
            proveedores=new ArrayList<>();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                proveedores.add(new Proveedor(rs.getInt("idProveedor"),rs.getLong("telefono"),rs.getString("rasonSocial"),rs.getString("domicilio"),rs.getBoolean("estado")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorData.class.getName()).log(Level.SEVERE, null, ex);
        }
        sql=null;
        return proveedores;
    }
}
