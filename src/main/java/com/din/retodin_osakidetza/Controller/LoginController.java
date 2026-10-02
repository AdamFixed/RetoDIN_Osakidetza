/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.din.retodin_osakidetza.Controller;

import com.din.retodin_osakidetza.Main.App;
import com.din.retodin_osakidetza.Dao.OsakidetzaDao;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.din.retodin_osakidetza.Dao.ImpOsakidetza;
import com.din.retodin_osakidetza.Modelo.*;
import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author asola
 */
public class LoginController implements Initializable {

    OsakidetzaDao dao = new ImpOsakidetza();
    ArrayList<Persona> personas = ImpOsakidetza.llenarDatos();
    public static Persona usuarioLogeado;

    @FXML
    private TextField usuario;
    @FXML
    private PasswordField contrasena;
    @FXML
    private Button primaryButton;
    @FXML
    private Label error;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        error.setVisible(false);
    }

@FXML
    public void login(ActionEvent ev) {
        boolean encontrado = false;
        String user = usuario.getText();
        String pswrd = contrasena.getText();
        
        for (int i = 0; i < personas.size() && !encontrado; i++) {
            if (personas.get(i).getUser().equals(user) && personas.get(i).getContrasena().equals(pswrd)) {
                usuarioLogeado = personas.get(i);
                encontrado = true;
            }
        }
        
        if (encontrado) {            
            try {
                if (usuarioLogeado instanceof Usuario) {
                    App.setRoot("usuario");
                } else if (usuarioLogeado instanceof Medico) {
                    App.setRoot("medico");
                } else if (usuarioLogeado instanceof Admin) {
                    App.setRoot("admin");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            error.setVisible(true);
        }
    }
}
