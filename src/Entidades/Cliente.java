package Entidades;
/**
 *
 * @author Turconi Matías
 */
public class Cliente {
    private int idCliente;
    private String nombre;
    private String domicilio;
    private String telefono;
    private boolean estado;
    
    public Cliente(String nombre, String domicilio, String telefono, boolean estado) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String domicilio, String telefono, boolean estado) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Cliente(int parseInt, String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", estado=" + estado + '}';
    }
    
    
    
}