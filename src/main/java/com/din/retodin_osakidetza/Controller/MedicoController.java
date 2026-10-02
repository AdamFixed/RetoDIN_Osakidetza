/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.din.retodin_osakidetza.Controller;

import com.din.retodin_osakidetza.Dao.ImpOsakidetza;
import com.din.retodin_osakidetza.Modelo.Persona;
import com.din.retodin_osakidetza.Modelo.Usuario;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author asola
 */
public class MedicoController implements Initializable {

    @FXML
    private ListView<Usuario> listaPacientes;
    @FXML
    private Label lblNombre;
    @FXML
    private Label lblTelefono;
    @FXML
    private Label lblDireccion;
    @FXML
    private Label lblNumSS;
    @FXML
    private Label lblCitas;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<Persona> personas = ImpOsakidetza.llenarDatos();

        for (Persona p : personas) {
            if (p instanceof Usuario usuario) {
                listaPacientes.getItems().add(usuario);
            }
        }

        listaPacientes.setCellFactory(param -> new ListCell<Usuario>() {
            @Override
            protected void updateItem(Usuario item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(item.getNombre() + " " + item.getApellidos());
                }
            }
        });

        listaPacientes.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                lblNombre.setText("Paciente: " + newValue.getNombre() + " " + newValue.getApellidos());
                lblTelefono.setText("Teléfono: " + newValue.getTelefono());
                lblDireccion.setText("Dirección: " + newValue.getDirecion());
                lblNumSS.setText("Seguridad Social: " + newValue.getNumSeguridadSocial());
                lblCitas.setText("Citas: " + newValue.getCitas().toString());
            }
        });
    }
}
