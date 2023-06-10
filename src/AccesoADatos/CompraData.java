/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

/**
 *
 * @author LuisaUtrera
 */
import Entidades.Compra;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CompraData {
    private final Connection con;

    public CompraData() {
        con = Conexion.getConexion();
    }

    public void agregarCompra(Compra compra) {
        String sql = "INSERT INTO compra(idCompra, idProveedor, fecha) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getIdCompra());
            ps.setInt(2, compra.getIdProveedor());
            ps.setDate(3, Date.valueOf(compra.getFecha()));
            ps.executeUpdate();
            System.out.println("Compra agregada");
        } catch (SQLException e) {
            Logger.getLogger(CompraData.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void eliminarCompra(int idCompra) {
        String sql = "DELETE FROM compra WHERE idCompra=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCompra);
            if (ps.executeUpdate() == 1) {
                System.out.println("Compra eliminada");
            } else {
                System.out.println("Compra no encontrada");
            }
        } catch (SQLException e) {
            Logger.getLogger(CompraData.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public Compra buscarCompra(int idCompra) {
        Compra compra = null;
        String sql = "SELECT * FROM compra WHERE idCompra=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setIdProveedor(rs.getInt("idProveedor"));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
            } else {
                System.out.println("Compra no encontrada");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompraData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return compra;
    }

 

}
