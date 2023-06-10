package accesoADatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteData {
    private Connection con;

    public ClienteData() {
        con = Conexion.getConexion();
    }

    public void agregarCliente(String nombre, String direccion, String telefono) {
        try {
            String sql = "INSERT INTO Clientes (nombre, direccion, telefono) VALUES (?, ?, ?)";
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nombre);
            ps.setString(2, direccion);
            ps.setString(3, telefono);
            ps.executeUpdate();
            System.out.println("Cliente agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el cliente: " + e.getMessage());
        }
    }
    
    public void modificarCliente(int id, String nuevoNombre, String nuevaDireccion, String nuevoTelefono) {
        try {
            String sql = "UPDATE Clientes SET nombre = ?, direccion = ?, telefono = ? WHERE id = ?";
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nuevoNombre);
            ps.setString(2, nuevaDireccion);
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
            String sql = "DELETE FROM Clientes WHERE id = ?";
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