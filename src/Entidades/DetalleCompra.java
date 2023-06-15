/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author LuisaUtrera
 */
public class DetalleCompra {
    private int detalle;
    private int cantidad;
    private double precioCosto;
    private int compra;
    private int producto;


    public DetalleCompra(int detalle, int cantidad, double precioCosto, int compra, int producto) {
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = compra;
        this.producto = producto;
    }

    public int getDetalle() {
        return detalle;
    }
    
    public void setDetalle(int detalle) {
        this.detalle = detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

   public int getCompra() {
        return compra;
    }

  public void setCompra(int compra) {
        this.compra = compra;
    }

     public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }
}