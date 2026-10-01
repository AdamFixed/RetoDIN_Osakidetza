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
import com.din.retodin_osakidetza.Dao.impOsakidetza;
import com.din.retodin_osakidetza.Modelo.*;
import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;

/**
 * FXML Controller class
 *
 * @author asola
 */
public class LoginController implements Initializable {

    OsakidetzaDao dao = new impOsakidetza();
    ArrayList<Persona> personas = impOsakidetza.llenarDatos();

    @FXML
    private TextField usuario;
    @FXML
    private PasswordField contrasena;
    @FXML
    private Button primaryButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void login(ActionEvent ev) {
        boolean encontrado = false;
        String user = usuario.getText();
        String pswrd = contrasena.getText();
        Persona logeado = null;
        for (int i = 0; i < personas.size() && !encontrado; i++) {
            if (personas.get(i).getUser().equals(user) && personas.get(i).getContrasena().equals(pswrd)) {
                logeado = personas.get(i);
            }
        }
        try {
            if (logeado instanceof Usuario) {
                App.setRoot("usuario");
            } else if (logeado instanceof Medico) {
                App.setRoot("medico");
            } else if (logeado instanceof Admin){
                App.setRoot("admin");
            }
        } catch (IOException ex) {
            System.getLogger(LoginController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

}
