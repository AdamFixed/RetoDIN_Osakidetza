/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.din.retodin_osakidetza.Controller;

import com.din.retodin_osakidetza.Dao.ImpOsakidetza;
import com.din.retodin_osakidetza.Dao.OsakidetzaDao;
import com.din.retodin_osakidetza.Main.App;
import com.din.retodin_osakidetza.Modelo.Admin;
import com.din.retodin_osakidetza.Modelo.Medico;
import com.din.retodin_osakidetza.Modelo.Persona;
import com.din.retodin_osakidetza.Modelo.Paciente;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author asola
 */
public class InforamcionController implements Initializable {

    OsakidetzaDao dao = new ImpOsakidetza();

    @FXML
    private ListView<Medico> listaMedicos;
    @FXML
    private ListView<Paciente> listaPacientes;
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
    private VBox editar;
    @FXML
    private Button guardar;
    @FXML
    private Button logOut;
    @FXML
    private VBox pacientes;
    @FXML
    private VBox medicos;
    @FXML
    private Label bienvenido;

    private Persona seleccionado = null;

    private Persona usuario = LoginController.usuarioLogeado;

    public static ArrayList<Persona> personas = null;
    @FXML
    private TextField tfNombre;
    @FXML
    private TextField tfApellido;
    @FXML
    private TextField tfTelefono;
    @FXML
    private TextField tfDato1;
    @FXML
    private TextField tfDato2;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        personas = LoginController.personas;
        editar.setVisible(false);
        bienvenido.setText(bienvenido.getText() + LoginController.usuarioLogeado.getUser());
        cargarDatos();
        if (usuario instanceof Admin) {
            listaMedicos.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue != null) {
                    seleccionado = (Medico) newValue;
                    mostrarDatosMedico(newValue);
                    lblDetalle.setText("Detalles del Médico");
                    listaPacientes.getSelectionModel().clearSelection();
                }
            });
        }
        if (usuario instanceof Admin || usuario instanceof Medico) {
            listaPacientes.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue != null) {
                    seleccionado = (Paciente) newValue;
                    mostrarDatosPaciente(newValue);
                    lblDetalle.setText("Detalles del Paciente");
                    listaMedicos.getSelectionModel().clearSelection();
                }
            });
        }
    }

    private void cargarDatos() {
        if (usuario instanceof Paciente) {
            medicos.setVisible(false);
            editar.setVisible(false);
            listaPacientes.getItems().add((Paciente) usuario);
        } else if (usuario instanceof Medico) {
            listaMedicos.getItems().add((Medico) usuario);
            for (Persona p : personas) {
                if (p instanceof Paciente) {
                    listaPacientes.getItems().add((Paciente) p);
                }
            }
        } else {
            for (Persona p : personas) {
                if (p instanceof Medico) {
                    listaMedicos.getItems().add((Medico) p);
                } else if (p instanceof Paciente) {
                    listaPacientes.getItems().add((Paciente) p);
                }
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

        listaPacientes.setCellFactory(param -> new ListCell<Paciente>() {
            @Override
            protected void updateItem(Paciente item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(item.getNombre() + " " + item.getApellidos());
                }
            }
        });
    }

    private void mostrarDatosMedico(Medico m) {
        editar.setVisible(true);
        lblNombre.setText("Nombre: " + m.getNombre());
        lblApellidos.setText("Apellidos: " + m.getApellidos());
        lblTelefono.setText("Teléfono: " + m.getTelefono());
        lblDato1.setText("Especialidad: " + m.getEspecialidad());
        lblDato2.setText("Horario: " + m.getHorario());
    }

    private void mostrarDatosPaciente(Paciente u) {
        editar.setVisible(true);
        lblNombre.setText("Nombre: " + u.getNombre());
        lblApellidos.setText("Apellidos: " + u.getApellidos());
        lblTelefono.setText("Teléfono: " + u.getTelefono());
        lblDato1.setText("Dirección: " + u.getDirecion());
        lblDato2.setVisible(false);
        tfDato2.setVisible(false);

    }

    @FXML
    public void guardar() {
        Paciente paciente = null;
        Medico medico = null;
        if (seleccionado instanceof Medico) {
            medico = (Medico) seleccionado;
            if (!tfNombre.getText().equals("")) {
                System.out.println(medico.getNombre());
            }
            if (!tfApellido.getText().equals("")) {
                medico.setApellidos(tfApellido.getText());
            }
            if (!tfTelefono.getText().equals("")) {
                if (tfTelefono.getText().matches("[0-9]{9}")) {
                    medico.setTelefono(Integer.parseInt(tfTelefono.getText()));
                }
            }
            if (!tfDato1.getText().equals("")) {
                medico.setEspecialidad(tfDato1.getText());
            }
            if (!tfDato2.getText().equals("")) {
                medico.setHorario(tfDato2.getText());
            }
            personas = dao.actualizar(medico, lblNombre.getText().split(" ")[1], lblApellidos.getText().split(" ")[1], personas);
        } else {
            paciente = (Paciente) seleccionado;
            if (!tfNombre.getText().equals("")) {
                paciente.setNombre(tfNombre.getText());
            }
            if (!tfApellido.getText().equals("")) {
                paciente.setApellidos(tfApellido.getText());
            }
            if (!tfTelefono.getText().equals("")) {
                if (tfTelefono.getText().matches("[0-9]{9}")) {
                    paciente.setTelefono(Integer.getInteger(tfTelefono.getText()));
                }
            }
            if (!tfDato1.getText().equals("")) {
                paciente.setDirecion(tfDato1.getText());
            }
            personas = dao.actualizar(paciente, lblNombre.getText().split(" ")[1], lblApellidos.getText().split(" ")[1], personas);
        }
        listaMedicos.getItems().clear();
        listaPacientes.getItems().clear();
        cargarDatos();
        tfNombre.setText("");
        tfApellido.setText("");
        tfTelefono.setText("");
        tfDato1.setText("");
        tfDato2.setText("");
        editar.setVisible(false);
    }

    @FXML
    public void logOut() {
        try {
            App.setRoot("login");
        } catch (IOException ex) {
            System.getLogger(InforamcionController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
