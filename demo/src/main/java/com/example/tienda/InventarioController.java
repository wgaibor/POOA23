package com.example.tienda;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    void guardar(ActionEvent event) {

    }

    @FXML
    void limpiar(ActionEvent event) {
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
    }

}
