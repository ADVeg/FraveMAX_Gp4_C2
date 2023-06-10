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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompraData {
    private final List<Compra> compras;

    public CompraData() {
        compras = new ArrayList<>();
    }

    public void agregarCompra(int idCompra, int idProveedor, Date fecha) {
        Compra compra = new Compra(idCompra, idProveedor, fecha);
        compras.add(compra);
    }

    public List<Compra> obtenerCompras() {
        return compras;
    }

    public void eliminarCompra(int idCompra) {
        Compra compraAEliminar = null;
        for (Compra compra : compras) {
            if (compra.getIdCompra() == idCompra) {
                compraAEliminar = compra;
                break;
            }
        }
        if (compraAEliminar != null) {
            compras.remove(compraAEliminar);
        }
    }

    public Compra buscarCompra(int idCompra) {
        for (Compra compra : compras) {
            if (compra.getIdCompra() == idCompra) {
                return compra;
            }
        }
        return null;
    }
}
