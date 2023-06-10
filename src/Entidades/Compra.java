/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author LuisaUtrera
 */
public class Compra {
    private int idCompra;
    private int idProveedor;
    private LocalDate fecha;

    public Compra(int idCompra, int idProveedor, LocalDate fecha) {
        this.idCompra = idCompra;
        this.idProveedor = idProveedor;
        this.fecha = fecha;
    }

    public Compra(int idProveedor, LocalDate fecha) {
         this.idProveedor = idProveedor;
         this.fecha = fecha;
    }

    public Compra() {
    }

   

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

  
    }


