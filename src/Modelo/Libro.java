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
public class Libro {

    private String idBook;
    private String autor;
    private String titulo;
    private String edicion;
    private String categoria;
    private String cantidad;
    private String precio;

    public Libro() {
    }

    public Libro(String idBook, String autor, String titulo, String edicion, String categoria, String cantidad, String precio) {
        this.idBook = idBook;
        this.autor = autor;
        this.titulo = titulo;
        this.edicion = edicion;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return this.idBook;
    }


    

}
