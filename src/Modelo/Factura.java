/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


/**
 *
 * @author usuario
 */
public class Factura {

    private String idInvoice;
    private String date;
    private String name;
    private String autor;
    private String edicion;
    private String categoria;
    private String cantidad;    
    private String iva;
    private String precio;

    public Factura() {
    }

    public Factura(String idInvoice, String date, String name, String autor, String edicion, String categoria, String cantidad, String iva, String precio) {
        this.idInvoice = idInvoice;
        this.date = date;
        this.name = name;
        this.autor = autor;
        this.edicion = edicion;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.iva = iva;
        this.precio = precio;
    }

    public String getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(String idInvoice) {
        this.idInvoice = idInvoice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return idInvoice;
    }

}
