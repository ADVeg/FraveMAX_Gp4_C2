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

    public List<Proveedor> Proveedores(){
        proveedores=null;
        sql="SELECT * FROM proveedor";
        try {
            proveedores=new ArrayList<>();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                proveedores.add(new Proveedor(rs.getInt("idProveedor"),rs.getString("rasonSocial"),rs.getString("domicilio"),rs.getLong("telefono")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorData.class.getName()).log(Level.SEVERE, null, ex);
        }
        sql=null;
        return proveedores;
    }
    
}
