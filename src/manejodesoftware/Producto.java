/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodesoftware;

/**
 *
 * @author Usuario
 */
public class Producto {
        String nombre;
    String marca;
    float precio;
    String categoria;
    int cantidad;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    void imprimirDatosPorConsola() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return this.nombre + "  " + this.marca + "  " + this.precio + "     " + this.categoria + "      " + this.cantidad;
    }

    public Producto() {
    }

}

