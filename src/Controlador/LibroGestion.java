/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Libro;
import Vista.IniciarSesion;
import Vista.BuscarLibro;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.Component;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.json.simple.parser.ParseException;

/**
 *
 * @author usuario
 */
public class LibroGestion {

    MongoDBadmi mongoDB = new MongoDBadmi();
    public void crearLibro(JTextField txtId, JTextField txtAutor, JTextField txtTitulo, JTextField txtEdicion, JTextField txtCategoria,
            JTextField txtPrecio, JTextField txtCantidad, Component rootPane, JLabel jlbOnlyNumbersPhoneNumber) {
        Document document = new Document();
        document.put("idBook", txtId.getText());
        document.put("autor", txtAutor.getText());
        document.put("titulo", txtTitulo.getText());
        document.put("edicion", txtEdicion.getText());
        document.put("categoria", txtCategoria.getText());
        document.put("cantidad", txtCantidad.getText());
        document.put("precio", txtPrecio.getText());
        int saveOption = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de guardar la informacion?");

        if (saveOption == 0) {
            mongoDB.save(document, "Books", IniciarSesion.database);
            JOptionPane.showMessageDialog(rootPane, "Guardado!");
            jlbOnlyNumbersPhoneNumber.setText("");
        } else if (saveOption == 1) {
            JOptionPane.showMessageDialog(rootPane, "Ok, intenta de nuevo.");
        }
    }

    public void cargarTablaLibros(JTable jtbProviderInformation, DefaultTableModel tableModel) {
        tableModel.addColumn("ID Book");
        tableModel.addColumn("Autor");
        tableModel.addColumn("Titulo");
        tableModel.addColumn("Edicion");
        tableModel.addColumn("Categoria");
        tableModel.addColumn("Cantidad");
        tableModel.addColumn("Precio");
        jtbProviderInformation.setModel(tableModel);
    }
    
    public void llenarTabla(DefaultTableModel tableModel) throws ParseException{
         ArrayList<Libro> books = new ArrayList<>();
        Gson gson = new Gson();
        String json = mongoDB.completeModel("Books", IniciarSesion.database);

        java.lang.reflect.Type bookType = new TypeToken<ArrayList<Libro>>() {
        }.getType();
        books = gson.fromJson(json, bookType);

        for (Libro book : books) {
            String[] rowProviders = {book.getIdBook(), book.getAutor(),
                book.getTitulo(), book.getEdicion(), book.getCategoria(),
                book.getCantidad(), book.getPrecio()};
            tableModel.addRow(rowProviders);
        }
    }

    public void cargarComboBox(JComboBox comboBox, DefaultComboBoxModel comboBoxModel) throws ParseException {
        ArrayList<Libro> books = new ArrayList<>();
        Gson gson = new Gson();
        String json = mongoDB.completeModel("Books", IniciarSesion.database);
        java.lang.reflect.Type bookType = new TypeToken<ArrayList<Libro>>() {
        }.getType();
        books = gson.fromJson(json, bookType);
        for (Libro book : books) {
            comboBoxModel.addElement(book);
        }        
        comboBox.setModel(comboBoxModel);
    }

    public void buscarLibro(JComboBox comboBoxModel, JTextField txtUpddateId, JTextField txtUpddateAutor, JTextField txtUpddateTitulo, JTextField txtUpdateEdicion, JTextField txtUpdateCategoria,
            JTextField txtUpdateCantidad, JTextField txtUpdatePrecio, DefaultTableModel tableModel) {
        ArrayList<Libro> books = new ArrayList<>();
        Gson gson = new Gson();
        String json = "";

        try {
            json = mongoDB.completeModel("Books", IniciarSesion.database);
        } catch (ParseException ex) {
            Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.lang.reflect.Type providerType = new TypeToken<ArrayList<Libro>>() {
        }.getType();
        books = gson.fromJson(json, providerType);
        Libro book = (Libro) comboBoxModel.getSelectedItem();

        String[] rowBooks = {book.getIdBook(), book.getAutor(),
            book.getTitulo(), book.getEdicion(), book.getCategoria(),
            book.getCantidad()};

        tableModel.addRow(rowBooks);

        books = gson.fromJson(json, providerType);

        txtUpddateId.setText(book.getIdBook());
        txtUpddateAutor.setText(book.getAutor());
        txtUpddateTitulo.setText(book.getTitulo());
        txtUpdateEdicion.setText(book.getEdicion());
        txtUpdateCategoria.setText(book.getCategoria());
        txtUpdateCantidad.setText(book.getCantidad());
        txtUpdatePrecio.setText(book.getPrecio());
    }

    public void actualizarLibro(Component rootPane, DefaultComboBoxModel comboBoxModel, JTextField txtUpddateId, JTextField txtUpddateAutor, JTextField txtUpddateTitulo, JTextField txtUpdateEdicion, JTextField txtUpdateCategoria,
            JTextField txtUpdateCantidad, JTextField txtUpdatePrecio) {

        int saveOption = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de actualizar la informacion?");
        if (saveOption == 0) {
            Libro book = (Libro) comboBoxModel.getSelectedItem();
            mongoDB.update("Books", "idBook", book.getIdBook(), txtUpddateId.getText(), IniciarSesion.database);
            mongoDB.update("Books", "autor", book.getAutor(), txtUpddateAutor.getText(), IniciarSesion.database);
            mongoDB.update("Books", "titulo", book.getTitulo(), txtUpddateTitulo.getText(), IniciarSesion.database);
            mongoDB.update("Books", "edicion", book.getEdicion(), txtUpdateEdicion.getText(), IniciarSesion.database);
            mongoDB.update("Books", "categoria", book.getCategoria(), txtUpdateCategoria.getText(), IniciarSesion.database);
            mongoDB.update("Books", "cantidad", book.getCantidad(), txtUpdateCantidad.getText(), IniciarSesion.database);
            mongoDB.update("Books", "precio", book.getCantidad(), txtUpdatePrecio.getText(), IniciarSesion.database);

            JOptionPane.showMessageDialog(rootPane, "Actualizado!");

        } else if (saveOption == 1) {
            JOptionPane.showMessageDialog(rootPane, "Ok, Vuelva a intertarlo.");
        }
    }

    public void borrarLibro(Component rootPane, DefaultComboBoxModel comboBoxModel, JTextField txtUpddateId, JTextField txtUpddateAutor, JTextField txtUpddateTitulo, JTextField txtUpdateEdicion, JTextField txtUpdateCategoria,
            JTextField txtUpdateCantidad, JTextField txtUpdatePrecio) {
        int saveOption = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de borrar la informacion?");

        if (saveOption == 0) {
            Libro book = (Libro) comboBoxModel.getSelectedItem();

            mongoDB.delete("Books", "idBook", book.getIdBook(), IniciarSesion.database);
            mongoDB.delete("Books", "autor", book.getAutor(), IniciarSesion.database);
            mongoDB.delete("Books", "titulo", book.getTitulo(), IniciarSesion.database);
            mongoDB.delete("Books", "edicion", book.getEdicion(), IniciarSesion.database);
            mongoDB.delete("Books", "categoria", book.getCategoria(), IniciarSesion.database);
            mongoDB.delete("Books", "cantidad", book.getCantidad(), IniciarSesion.database);
            mongoDB.delete("Books", "precio", book.getPrecio(), IniciarSesion.database);
            JOptionPane.showMessageDialog(rootPane, "Libro Borrado!");

        } else if (saveOption == 1) {
            JOptionPane.showMessageDialog(rootPane, "Ok,vuelva a intertarlo.");
        }
    }

}
