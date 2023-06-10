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
import java.util.ArrayList;
import java.util.List;

public class DetalleCompraData {
    private final List<DetalleCompra> detalleCompras;

    public DetalleCompraData() {
        this.detalleCompras = new ArrayList<>();
    }

    public void agregarDetalleCompra(int idDetalle, int cantidad, double precioCosto, int idCompra, int idProducto) {
        DetalleCompra detalleCompra = new DetalleCompra(idDetalle, cantidad, precioCosto, idCompra, idProducto);
        detalleCompras.add(detalleCompra);
    }

    public List<DetalleCompra> obtenerTodosLosDetallesCompra() {
        return detalleCompras;
    }

    public DetalleCompra obtenerDetalleCompraPorId(int idDetalle) {
        for (DetalleCompra detalleCompra : detalleCompras) {
            if (detalleCompra.getIdDetalle() == idDetalle) {
                return detalleCompra;
            }
        }
        return null;
    }

    public void actualizarDetalleCompra(int idDetalle, int nuevaCantidad, double nuevoPrecioCosto, int nuevoIdCompra, int nuevoIdProducto) {
        for (DetalleCompra detalleCompra : detalleCompras) {
            if (detalleCompra.getIdDetalle() == idDetalle) {
                detalleCompra.setCantidad(nuevaCantidad);
                detalleCompra.setPrecioCosto(nuevoPrecioCosto);
                detalleCompra.setIdCompra(nuevoIdCompra);
                detalleCompra.setIdProducto(nuevoIdProducto);
                break;
            }
        }
    }

    public void eliminarDetalleCompra(int idDetalle) {
        detalleCompras.removeIf(detalleCompra -> detalleCompra.getIdDetalle() == idDetalle);
    }
}
