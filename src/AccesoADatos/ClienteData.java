package AccesoADatos;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try {
            String sql = "INSERT INTO cliente (nombre, domicilio, telefono) VALUES (?, ?, ?)";
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, clien.getNombre());
            ps.setString(2, clien.getDomicilio());
            ps.setString(3, clien.getTelefono());
            ps.executeUpdate();
            System.out.println("Cliente agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el cliente: " + e.getMessage());
        }
    }
    
    public void modificarCliente(Cliente clien) {
        try {
            String sql = "UPDATE Cliente SET nombre = ?, domicilio = ?, telefono = ? WHERE idCliente = ?";
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, clien.getNombre());
            ps.setString(2, clien.getDomicilio());
            ps.setString(3, clien.getTelefono());
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
            String sql = "DELETE FROM cliente WHERE idCliente = ?";
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
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
        String sql="SELECT * FROM cliente WHERE idVenta=?";
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
                System.out.println("Producto no encontrado");
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
            }else{
                System.out.println("Producto no encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
}
