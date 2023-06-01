/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Proveedor {
    
    private int idProveedor;
    private long telefono;
    private String rasonSocial;
    private String domicilio;
    
    public Proveedor(){
        
    }
    
    public Proveedor(String rasonSocial, String domicilio, long telefono){
        
        this.rasonSocial=rasonSocial;
        this.domicilio=domicilio;
        this.telefono=telefono;
        
    }
    
    public Proveedor(int idProveedor, String rasonSocial, String domicilio, long telefono){
        
        this.idProveedor=idProveedor;
        this.rasonSocial=rasonSocial;
        this.domicilio=domicilio;
        this.telefono=telefono;
        
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
    
}
