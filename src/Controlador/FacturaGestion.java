/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Libro;
import Modelo.Factura;
import Vistas.IniciarSesion;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.json.simple.parser.ParseException;

/**
 *
 * @author usuario
 */
public class FacturaGestion {

    MongoDBadmi mongoDB = new MongoDBadmi();

    public FacturaGestion() {
    }

    public void cargarModeloComboBoxLibros(DefaultComboBoxModel model) throws ParseException {
        ArrayList<Libro> books = new ArrayList<>();
        Gson gson = new Gson();
        String json = mongoDB.completeModel("Books", IniciarSesion.database);
        java.lang.reflect.Type customerType = new TypeToken<ArrayList<Libro>>() {
        }.getType();
        books = gson.fromJson(json, customerType);
        for (Libro book : books) {
            model.addElement(book);
        }

    }

    public void cargarModeloComboBoxFactura(DefaultComboBoxModel modelInvoicesbyId) throws ParseException {
        ArrayList<Factura> invoices = new ArrayList<>();
        Gson gson = new Gson();
        String json = mongoDB.completeModel("Invoices", IniciarSesion.database);

        java.lang.reflect.Type invoiceType = new TypeToken<ArrayList<Factura>>() {
        }.getType();
        invoices = gson.fromJson(json, invoiceType);

        for (Factura invoice : invoices) {
            modelInvoicesbyId.addElement(invoice);
        }

    }

    public void cartTablaFactura(DefaultTableModel modelTable) {
        modelTable.addColumn("ID");
        modelTable.addColumn("Fecha");
        modelTable.addColumn("Nombre del Libro");
        modelTable.addColumn("Autor");
        modelTable.addColumn("Edicion");
        modelTable.addColumn("Categoria");
        modelTable.addColumn("Cantidad");
        modelTable.addColumn("I.V.A");
        modelTable.addColumn("Precio Final");
    }

    public void llenarTablaFactura(DefaultTableModel tableModelInvoices) throws ParseException {
        ArrayList<Factura> invoices = new ArrayList<>();
        Gson gson = new Gson();
        String json = mongoDB.completeModel("Invoices", IniciarSesion.database);
        java.lang.reflect.Type invoiceType = new TypeToken<ArrayList<Factura>>() {
        }.getType();
        invoices = gson.fromJson(json, invoiceType);
        for (Factura invoice : invoices) {
            String[] rowInvoice = {invoice.getIdInvoice(), invoice.getDate(), invoice.getName(),
                invoice.getAutor(), invoice.getEdicion(), invoice.getCategoria(), invoice.getCantidad(),
                invoice.getIva(), invoice.getPrecio()};
            tableModelInvoices.addRow(rowInvoice);
        }
    }

    public void crearFactura(JTextField txtTotal, JTextField txtQuantity, JTextField txtId, JTextField txtDate,
            JTextField txtTitulo, JTextField txtAutor, JTextField txtEdicion, JTextField txtCategoria,
            JTextField txtIva, DefaultComboBoxModel model, Component rootPane) {
        try {
            double tax;
            double pricePerUnit;
            double totalWithoutIva = 0;
            double totalWithIva = Double.parseDouble(txtTotal.getText());
            int quantity;
            int nuevaCantidad;
            long totalQuantity = Long.parseLong(txtQuantity.getText());

            Document document = new Document();
            document.put("idInvoice", txtId.getText());
            document.put("date", txtDate.getText());
            document.put("name", txtTitulo.getText());
            document.put("autor", txtAutor.getText());
            document.put("edicion", txtEdicion.getText());
            document.put("categoria", txtCategoria.getText());
            document.put("cantidad", txtQuantity.getText());
            document.put("iva", txtIva.getText());

            Libro book = (Libro) model.getSelectedItem();
            tax = Integer.parseInt(txtIva.getText());
            pricePerUnit = Double.parseDouble(book.getPrecio());
            if (Integer.parseInt(txtQuantity.getText()) > Integer.parseInt(book.getCantidad())) {
                JOptionPane.showMessageDialog(rootPane, "Cantidad disponible excedida.");
            } else {
                quantity = Integer.parseInt(txtQuantity.getText());
                nuevaCantidad = Integer.parseInt(book.getCantidad()) - quantity;
                totalWithoutIva = quantity * pricePerUnit;
                totalWithIva = ((tax / 100) * (totalWithoutIva)) + (totalWithoutIva);
                txtTotal.setText(String.valueOf(totalWithIva));
                document.put("precio", txtTotal.getText());
                int saveOption = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de guardar la informacion?");
                if (saveOption == 0) {
                    mongoDB.update("Books", "idBook", book.getIdBook(), book.getIdBook(), IniciarSesion.database);
                    mongoDB.update("Books", "autor", book.getAutor(), book.getAutor(), IniciarSesion.database);
                    mongoDB.update("Books", "titulo", book.getTitulo(), book.getTitulo(), IniciarSesion.database);
                    mongoDB.update("Books", "edicion", book.getEdicion(), book.getEdicion(), IniciarSesion.database);
                    mongoDB.update("Books", "categoria", book.getCategoria(), book.getCategoria(), IniciarSesion.database);
                    mongoDB.update("Books", "cantidad", book.getCantidad(), String.valueOf(nuevaCantidad), IniciarSesion.database);
                    mongoDB.update("Books", "precio", book.getCantidad(), book.getPrecio(), IniciarSesion.database);
                    mongoDB.save(document, "Invoices", IniciarSesion.database);
                    JOptionPane.showMessageDialog(rootPane, "Guardado y vendido!");
                } else if (saveOption == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Ok, intenta de nuevo.");
                }

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Campos vacios o incorrectos.");
        }
    }

    public void mostrarDatosFactura(DefaultComboBoxModel model, JTextField txtTotal, JTextField txtQuantity, JTextField txtId, JTextField txtDate,
            JTextField txtTitulo, JTextField txtAutor, JTextField txtEdicion, JTextField txtCategoria,
            JTextField txtIva, JTextField txtPrecio) {

        Libro book = (Libro) model.getSelectedItem();
        txtAutor.setText(book.getAutor());
        txtAutor.setEditable(false);
        txtTitulo.setText(book.getTitulo());
        txtTitulo.setEditable(false);
        txtCategoria.setText(book.getCategoria());
        txtCategoria.setEditable(false);
        txtPrecio.setText(book.getPrecio());
        txtPrecio.setEditable(false);
        txtEdicion.setText(book.getEdicion());
        txtEdicion.setEditable(false);

    }

    public void cargarFechaFactura(JTextField txtDate, JTextField txtQuantity, JTextField txtTotal) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
        txtDate.setEditable(false);
        txtDate.setText(simpleDateFormat.format(date));
        txtQuantity.setText("0");
        txtTotal.setText("0.0");
    }

    public void buscarFactura(DefaultComboBoxModel modelInvoicesbyId, DefaultTableModel modelTable) {
        Factura invoice = (Factura) modelInvoicesbyId.getSelectedItem();
        String[] rowInvoices = {invoice.getIdInvoice(), invoice.getDate(), invoice.getName(),
            invoice.getAutor(), invoice.getEdicion(), invoice.getCategoria(), invoice.getCantidad(),
            invoice.getIva(), invoice.getPrecio()};
        modelTable.addRow(rowInvoices);
    }
}
