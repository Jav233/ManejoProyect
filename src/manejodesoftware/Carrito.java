
package manejodesoftware;


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
