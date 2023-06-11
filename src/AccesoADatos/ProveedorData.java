/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Turconi Matías
 */
public class ProveedorData {
    
    public class ClienteData {
    private Connection con;
        private String sql;

    public ClienteData() {
        con = Conexion.getConexion();
    }
    
    public void realizarPedido(String producto, int cantidad, String fecha) {
        try {
            String query = "INSERT INTO pedidos (producto, cantidad, fecha) VALUES (?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, producto);
                ps.setInt(2, cantidad);
                ps.setString(3, fecha);
                ps.executeUpdate();
                System.out.println("Pedido registrado exitosamente.");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar el pedido: " + e.getMessage());
        }
    }
    }
}
