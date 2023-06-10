package Entidades;

/**
 *
 * @author Usuario
 */
public class DetalleVenta {
    private int idDetalleVent;
    private int cantidad;
    private double precioVenta;
    private Venta venta;
    private Producto producto;

    public DetalleVenta() {
        venta=new Venta();
        producto=new Producto();
    }

    public DetalleVenta(int cantidad, double precioVenta, Venta venta, Producto producto) {
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.venta = venta;
        this.producto = producto;
    }

    public DetalleVenta(int idDetalleVent, int cantidad, double precioVenta, Venta venta, Producto producto) {
        this.idDetalleVent = idDetalleVent;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.venta = venta;
        this.producto = producto;
    }

    public int getIdDetalleVent() {
        return idDetalleVent;
    }

    public void setIdDetalleVent(int idDetalleVent) {
        this.idDetalleVent = idDetalleVent;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetalleVent=" + idDetalleVent + ", cantidad=" + cantidad + ", precioVenta=" + precioVenta + ", venta=" + venta + ", producto=" + producto + '}';
    }
    
}
