/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.din.retodin_osakidetza.Controller;

import com.din.retodin_osakidetza.Dao.ImpOsakidetza;
import com.din.retodin_osakidetza.Modelo.Medico;
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
public class AdminController implements Initializable {

    @FXML
    private ListView<Medico> listaMedicos;
    @FXML
    private ListView<Usuario> listaPacientes;

    
    @FXML
    private Label lblDetalle;
    @FXML
    private Label lblNombre;
    @FXML
    private Label lblApellidos;
    @FXML
    private Label lblTelefono;
    @FXML
    private Label lblDato1;
    @FXML
    private Label lblDato2;
    @FXML
    private Label lblDato3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<Persona> personas = ImpOsakidetza.llenarDatos();

        for (Persona p : personas) {
            if (p instanceof Medico) {
                listaMedicos.getItems().add((Medico) p);
            } else if (p instanceof Usuario) {
                listaPacientes.getItems().add((Usuario) p);
            }
        }

        listaMedicos.setCellFactory(param -> new ListCell<Medico>() {
            @Override
            protected void updateItem(Medico item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(item.getNombre() + " " + item.getApellidos());
                }
            }
        });

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

        listaMedicos.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                mostrarDatosMedico(newValue);
                lblDetalle.setText("Detalles del Médico");
                listaPacientes.getSelectionModel().clearSelection();
            }
        });

        listaPacientes.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                mostrarDatosPaciente(newValue);
                lblDetalle.setText("Detalles del Paciente");
                listaMedicos.getSelectionModel().clearSelection();
            }
        });
    }

    private void mostrarDatosMedico(Medico m) {
        lblNombre.setText("Nombre: " + m.getNombre());
        lblApellidos.setText("Apellidos: " + m.getApellidos());
        lblTelefono.setText("Teléfono: " + m.getTelefono());
        lblDato1.setText("Especialidad: " + m.getEspecialidad());
        lblDato2.setText("Sala: " + m.getNumeroDeSala());
        lblDato3.setText("Horario: " + m.getHorario());
    }

    private void mostrarDatosPaciente(Usuario u) {
        lblNombre.setText("Nombre: " + u.getNombre());
        lblApellidos.setText("Apellidos: " + u.getApellidos());
        lblTelefono.setText("Teléfono: " + u.getTelefono());
        lblDato1.setText("Dirección: " + u.getDirecion());
        lblDato2.setText("Nº SS: " + u.getNumSeguridadSocial());
        lblDato3.setText("Citas: " + u.getCitas().size() + " citas registradas");
    }

}
