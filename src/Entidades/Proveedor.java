package Entidades;

/**
 *
 * @author Turconi Matías
 */
public class Proveedor {
    
    private int idProveedor;
    private long telefono;
    private String rasonSocial;
    private String domicilio;
    private boolean estado;
    
    public Proveedor(){
        
    }

    public Proveedor(long telefono, String rasonSocial, String domicilio, boolean estado) {
        this.telefono = telefono;
        this.rasonSocial = rasonSocial;
        this.domicilio = domicilio;
        this.estado = estado;
    }

    public Proveedor(int idProveedor, long telefono, String rasonSocial, String domicilio, boolean estado) {
        this.idProveedor = idProveedor;
        this.telefono = telefono;
        this.rasonSocial = rasonSocial;
        this.domicilio = domicilio;
        this.estado = estado;
    }

    public void setIdProveedor (int idProveedor){
        
        this.idProveedor=idProveedor;
        
    }
    
    public void setRasonSocial (String rasonSocial){
        
        this.rasonSocial=rasonSocial;
        
    }
    
    public void setDomicilio (String domicilio){
        
        this.domicilio=domicilio;
        
    }
    
    public void setTelefono (long telefono){
        
        this.telefono=telefono;
        
    }
    
    public int getIdProveedor(){
        
        return idProveedor; 
    }
    
    public String getRasonSocial(){
        
        return rasonSocial;
        
    }
    
    public String getDomicilio(){
        
        return domicilio;
        
    }
    
    public long getTelefono(){
        
        return telefono;
        
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return rasonSocial;
    }
    
}
