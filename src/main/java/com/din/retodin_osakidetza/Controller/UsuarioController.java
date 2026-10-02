/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.din.retodin_osakidetza.Controller;

import com.din.retodin_osakidetza.Modelo.Usuario;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author asola
 */
public class UsuarioController implements Initializable {

    @FXML
    private Label bienvenido;

    @FXML
    private Label datos;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Usuario miUsuario = (Usuario) LoginController.usuarioLogeado;

        if (miUsuario != null) {
            bienvenido.setText("Hola, " + miUsuario.getNombre());

            String info = "Nombre: " + miUsuario.getNombre() + "\n" + "Apellidos: " + miUsuario.getApellidos() + "\n" + "Teléfono: " + miUsuario.getTelefono() + "\n" + "Citas: " + miUsuario.getCitas().toString();
            datos.setText(info);
        }
    }

}
