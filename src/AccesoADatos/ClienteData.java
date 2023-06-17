package AccesoADatos;

import Entidades.Cliente;
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
 * @author Turcni Matías
 */
public class ClienteData {
    private Connection con;

    public ClienteData() {
        con = Conexion.getConexion();
    }

    public void agregarCliente(Cliente clien) {
        if(buscarTelefono(clien.getTelefono())==null){
        try {
            String sql = "INSERT INTO cliente (nombre, domicilio, telefono, estado) VALUES (?, ?, ?, ?)";
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, clien.getNombre());
            ps.setString(2, clien.getDomicilio());
            ps.setString(3, clien.getTelefono());
            ps.setBoolean(4, clien.isEstado());
            ps.executeUpdate();
            System.out.println("Cliente agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el cliente: " + e.getMessage());
        }
    }else{
            JOptionPane.showMessageDialog(null,"El cliente ya esta cargado");
        }
    }
    
    public void modificarCliente(Cliente clien) {
        try {
            String sql = "UPDATE cliente SET nombre = ?, domicilio = ?, telefono = ?, estado = ? WHERE idCliente = ?";
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, clien.getNombre());
            ps.setString(2, clien.getDomicilio());
            ps.setString(3, clien.getTelefono());
            ps.setBoolean(4, clien.isEstado());
            ps.setInt(5, clien.getIdCliente());
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Cliente modificado correctamente.");
            } else {
                System.out.println("No se encontró el cliente");
            }
        } catch (SQLException e) {
            System.out.println("Error al modificar el cliente: " + e.getMessage());
        }
    }
    
    public void eliminarCliente(int id) {
        try {
            String sql = "UPDATE cliente SET estado=false WHERE idCliente = ?";
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Cliente eliminado correctamente.");
            } else {
                System.out.println("No se encontró el cliente con el ID proporcionado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar el cliente: " + e.getMessage());
        }
    }
    
    public Cliente buscarID(int id){
        Cliente cliente=null;
        String sql="SELECT * FROM cliente WHERE idVenta=? and estado=true";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                cliente=new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getString("telefono"));
            }else{
                System.out.println("Cliente no encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }

    public Cliente buscarTelefono(String telefono){
        Cliente cliente=null;
        String sql="SELECT * FROM cliente WHERE telefono=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, telefono);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                cliente=new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setEstado(rs.getBoolean("estado"));
            }else{
                System.out.println("Cliente no encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
    
    public Cliente buscarTelefonoEliminar (String telefono){
        Cliente cliente=null;
        String sql="SELECT * FROM cliente WHERE telefono=? and estado=true";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, telefono);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                cliente=new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setEstado(rs.getBoolean("estado"));
            }else{
                System.out.println("Cliente no encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
    
    
    
    public List<Cliente> clientes(){
        List<Cliente> clientes=new ArrayList<>();
        String sql="SELECT * FROM cliente";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                clientes.add(new Cliente(rs.getInt("idCliente"),rs.getString("nombre"),rs.getString("domicilio"),rs.getString("telefono"),rs.getBoolean("estado")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }

  

   
}
