package Entidades;

/**
 *
 * @author Usuario
 */
public class Producto {
    private int idProducto;
    private String nombre;////agregar DB
    private double precioActual;
    private int stock;
    private boolean estado;

    public Producto() {
    }

    public Producto(String nombre, double precioActual, int stock, boolean estado) {
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.stock = stock;
        this.estado = estado;
    }

    public Producto(int id, String nombre, double precioActual, int stock, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.stock = stock;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precioActual=" + precioActual + ", stock=" + stock + ", estado=" + estado + '}';
    }
    
}
