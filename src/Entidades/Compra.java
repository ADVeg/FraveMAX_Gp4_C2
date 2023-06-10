/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author LuisaUtrera
 */
public class Compra {
    private int idCompra;
    private int idProveedor;
    private date fecha;

    public Compra(int idCompra, int idProveedor, date fecha) {
        this.idCompra = idCompra;
        this.idProveedor = idProveedor;
        this.fecha = fecha;
    }

    public Compra(int idCompra, int idProveedor, Date fecha) {
        throw new UnsupportedOperationException(""); //No se que poner aca
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

    public date getFecha() {
        return fecha;
    }

    public void setFecha(date fecha) {
        this.fecha = fecha;
    }

    private static class date {

        public date() {
        }
    }
}

