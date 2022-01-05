/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodesoftware;

/**
 *
 * @author Karen
 */
import java.util.LinkedList;

public class Carrito {

    LinkedList<Producto> prodCarrito;
    float valorTotal;
    boolean pagado;

    public Carrito() {
        this.prodCarrito = new LinkedList<Producto>();

    }

    void agregarCarrito(Producto producto) {
        if (producto != null) {
            this.prodCarrito.add(producto);
            System.out.println("Producto agregado");
        }
    }

}
