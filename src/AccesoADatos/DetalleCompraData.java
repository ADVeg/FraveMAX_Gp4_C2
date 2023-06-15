/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

/**
 *
 * @author Luisautrera
 */
import Entidades.DetalleCompra;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DetalleCompraData {
    private final Connection con;

    public DetalleCompraData() {
        con = Conexion.getConexion();
    }

    public void agregarDetalleCompra(DetalleCompra detalleCompra) {
        String sql = "INSERT INTO detallecompra(Detalle, cantidad, precioCosto, Compra, Producto) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalleCompra.getDetalle());
            ps.setInt(2, detalleCompra.getCantidad());
            ps.setDouble(3, detalleCompra.getPrecioCosto());
            ps.setInt(4, detalleCompra.getCompra().getIdCompra());
            ps.setInt(5, detalleCompra.getProducto().getIdProducto());
            ps.executeUpdate();
            System.out.println("Detalle de compra agregado");
        } catch (SQLException e) {
            Logger.getLogger(DetalleCompraData.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void actualizarDetalleCompra(DetalleCompra detalleCompra) {
        String sql = "UPDATE detallecompra SET cantidad=?, precioCosto=?, idCompra=?, idProducto=? WHERE idDetalle=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalleCompra.getCantidad());
            ps.setDouble(2, detalleCompra.getPrecioCosto());
            ps.setInt(3, detalleCompra.getCompra().getIdCompra());
            ps.setInt(4, detalleCompra.getProducto().getIdProducto());
            ps.setInt(5, detalleCompra.getDetalle());
            ps.executeUpdate();
            System.out.println("Detalle de compra actualizado");
        } catch (SQLException e) {
            Logger.getLogger(DetalleCompraData.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void eliminarDetalleCompra(int idDetalle) {
        String sql = "DELETE FROM detallecompra WHERE idDetalle=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idDetalle);
            if (ps.executeUpdate() == 1) {
                System.out.println("Detalle de compra eliminado");
            } else {
                System.out.println("Detalle de compra no encontrado");
            }
        } catch (SQLException e) {
            Logger.getLogger(DetalleCompraData.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}