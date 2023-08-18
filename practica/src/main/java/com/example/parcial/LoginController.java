package com.example.parcial;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

    private String usuario = "lemas";
    private String contrasenia = "1234";

    @FXML
    private Button btnIngresar;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsuario;

    @FXML
    void ingresar(ActionEvent event) throws IOException {
        String campoUsuario = txtUsuario.getText();
        String campoContrasenia = txtPassword.getText();

        if(campoUsuario.equalsIgnoreCase("")){
            Alert alert = new Alert(AlertType.INFORMATION, "El campo usuario es requerido");
            alert.showAndWait();
            return;
        }

        if(campoContrasenia.equalsIgnoreCase("")){
            Alert alert = new Alert(AlertType.INFORMATION, "El campo contraseña es requerido");
            alert.showAndWait();
            return;
        }

        if(campoUsuario.equalsIgnoreCase(usuario) && campoContrasenia.equalsIgnoreCase(contrasenia)) {
            Main.setRoot("inventario");
        } else {
            Alert alert = new Alert(AlertType.ERROR, "Credenciales invalidas");
            alert.showAndWait();
            return;
        }
    }

}
