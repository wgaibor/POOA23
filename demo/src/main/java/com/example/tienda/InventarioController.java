package com.example.tienda;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class InventarioController {

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtDescripcion;

    @FXML
    private TextField txtPrecio;
    
    @FXML
    private TableColumn<?, ?> tbcCodigo;

    @FXML
    private TableColumn<?, ?> tbcDescripcion;

    @FXML
    private TableColumn<?, ?> tbcPrecio;

    @FXML
    private TableView<InventarioEntity> tblInventario;

    List<InventarioEntity> lstInventario = new ArrayList<>();

    @FXML
    void guardar(ActionEvent event) {
        String id = txtCodigo.getText();
        String descripcion = txtDescripcion.getText();
        String precio = txtPrecio.getText();

        InventarioEntity inventario = new InventarioEntity();
        inventario.setCodigo(id);
        inventario.setDescripcion(descripcion);
        inventario.setPrecio(precio);
        lstInventario.add(inventario);
        limpiar(event);

        mostrarGrilla(lstInventario);
    }

    private void mostrarGrilla(List<InventarioEntity> lstInventario) {
        tblInventario.getItems().clear();

        tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        tbcDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        tbcPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));

        ObservableList<InventarioEntity> items = FXCollections.observableArrayList(lstInventario);
        tblInventario.setItems(items);
    }

    @FXML
    void limpiar(ActionEvent event) {
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
    }

}
