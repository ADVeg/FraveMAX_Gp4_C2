package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Turconi Matías
 */
public class Venta {
    private int idVenta;
    private LocalDate fecha;
    private Cliente Cliente;

    public Venta() {
    }

    public Venta(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Venta(int idVenta, LocalDate fecha, Cliente Cliente) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.Cliente = Cliente;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }
    
    
}
