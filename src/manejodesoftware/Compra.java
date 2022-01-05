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
public class Compra {
       int num;
    boolean pagada;
    double total;

    public Compra(int num, boolean pagada, double total) {
        this.num = num;
        this.pagada = pagada;
        this.total = total;
    }

    private String generarEstadoCompra() {
        if (this.pagada = true) {
            return "Pagada";
        } else {
            return "No Pagada";
        }
    }

    void imprimirDatosPorConsola() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return this.num + "          " + generarEstadoCompra() + "       " + this.total;
    }

} 

