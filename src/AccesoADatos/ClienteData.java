package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Turcni Matías
 */
public class ClienteData {
    private Connection con;

    public ClienteData() {
        con = Conexion.getConexion();
    }

    public void agregarCliente(String nombre, String domicilio, String telefono) {
        try {
            String sql = "INSERT INTO cliente (nombre, domicilio, telefono) VALUES (?, ?, ?)";
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nombre);
            ps.setString(2, domicilio);
            ps.setString(3, telefono);
            ps.executeUpdate();
            System.out.println("Cliente agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el cliente: " + e.getMessage());
        }
    }
    
    public void modificarCliente(int id, String nuevoNombre, String nuevoDomicilio, String nuevoTelefono) {
        try {
            String sql = "UPDATE Cliente SET nombre = ?, domicilio = ?, telefono = ? WHERE idCliente = ?";
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nuevoNombre);
            ps.setString(2, nuevoDomicilio);
            ps.setString(3, nuevoTelefono);
            ps.setInt(4, id);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Cliente modificado correctamente.");
            } else {
                System.out.println("No se encontró el cliente con el ID proporcionado.");
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

}
