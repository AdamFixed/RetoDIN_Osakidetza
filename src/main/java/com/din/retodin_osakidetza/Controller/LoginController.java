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

    public static Persona usuarioLogeado = null;

    public static ArrayList<Persona> personas;

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
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        if (InforamcionController.personas == null) {
            personas = dao.fillData();
        } else {
            personas = InforamcionController.personas;
        }
        error.setVisible(false);
    }

    @FXML
    public void login(ActionEvent ev) {
       usuarioLogeado = dao.buscar(usuario.getText(), contrasena.getText(), personas);
        if (usuarioLogeado!=null) {
            try {
                App.setRoot("inforamcion");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            error.setVisible(true);
        }
    }
}
