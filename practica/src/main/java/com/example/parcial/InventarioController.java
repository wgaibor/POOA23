package com.example.parcial;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventarioController {

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private TableColumn<?, ?> tbcCantidad;

    @FXML
    private TableColumn<?, ?> tbcCodigo;

    @FXML
    private TableColumn<?, ?> tbcDescripcion;

    @FXML
    private TableView<InventarioEntity> tblInventario;

    @FXML
    private TextField txtCantidad;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtDescripcion;

    List<InventarioEntity> lstInventario = new ArrayList<>();

    @FXML
    void guardar(ActionEvent event) {
        String codigo = txtCodigo.getText();
        String descripcion = txtDescripcion.getText();
        String cantidad = txtCantidad.getText();

        InventarioEntity objInventario = new InventarioEntity();
        objInventario.setCodigo(codigo);
        objInventario.setDescripcion(descripcion);
        objInventario.setCantidad(cantidad);
        lstInventario.add(objInventario);

        limpiar(event);

        llenarLaTabla(lstInventario);

    }

    private void llenarLaTabla(List<InventarioEntity> lstInventario) {
        tblInventario.getItems().clear();

        tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        tbcDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        tbcCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));

        ObservableList<InventarioEntity> items = FXCollections.observableArrayList(lstInventario);
        tblInventario.setItems(items);
    }

    @FXML
    void limpiar(ActionEvent event) {
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtCantidad.setText("");
    }

}
