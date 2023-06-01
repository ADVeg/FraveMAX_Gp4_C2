package Entidades;
/**
 *
 * @author Turconi Matías
 */
public class Venta {
    private int idVenta;
    private int fecha;
    private int idCiente;

    public Venta() {
    }

    public Venta(int fecha) {
        this.fecha = fecha;
    }

    public Venta(int idVenta, int fecha, int idCiente) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.idCiente = idCiente;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getIdCiente() {
        return idCiente;
    }

    public void setIdCiente(int idCiente) {
        this.idCiente = idCiente;
    }
    
    
}
