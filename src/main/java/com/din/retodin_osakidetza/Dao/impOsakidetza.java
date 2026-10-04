/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.din.retodin_osakidetza.Dao;

import static com.din.retodin_osakidetza.Controller.LoginController.personas;
import static com.din.retodin_osakidetza.Controller.LoginController.usuarioLogeado;
import com.din.retodin_osakidetza.Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author asola
 */
public class ImpOsakidetza implements OsakidetzaDao {

    ArrayList<Persona> personas = null;
    /**
     * Llena la lista de personas con datos de ejemplo.
     */
    @Override
    public ArrayList<Persona> fillData() {
        personas = new ArrayList<Persona>();
        personas.add(new Admin(1, "admin", "admin123", "Carlos", "Ruiz Etxeberria", 943111111));

        personas.add(new Medico("Cardiología", 101, "08:00 - 15:00",
                "mgarcia", "1234", "María", "García López", 943222222));
        personas.add(new Medico("Pediatría", 102, "09:00 - 16:00",
                "jperez", "1234", "Jon", "Pérez Goikoetxea", 943333333));
        personas.add(new Medico("Traumatología", 203, "15:00 - 22:00",
                "aurrutia", "1234", "Ane", "Urrutia Zabala", 943444444));

        ArrayList<String> citas1 = new ArrayList<>();
        citas1.add("12/11/2026 10:00 - Cardiología");
        citas1.add("03/12/2026 11:30 - Revisión");
        personas.add(new Paciente(citas1, "Calle Mayor 5, Donostia", "SS-001122334455",
                "pgomez", "1234", "Pedro", "Gómez Martín", 600111111));

        ArrayList<String> citas2 = new ArrayList<>();
        citas2.add("20/10/2026 09:15 - Pediatría");
        personas.add(new Paciente(citas2, "Avenida Libertad 12, Donostia", "SS-556677889900",
                "lfernandez", "1234", "Laura", "Fernández Sáenz", 600222222));

        personas.add(new Paciente(new ArrayList<>(), "Calle Easo 8, Donostia", "SS-998877665544",
                "iaranburu", "1234", "Iker", "Aranburu Mendia", 600333333));

        ArrayList<String> citas4 = new ArrayList<>();
        citas4.add("05/11/2026 17:00 - Traumatología");
        citas4.add("19/11/2026 17:30 - Traumatología");
        citas4.add("10/12/2026 12:00 - Análisis");
        personas.add(new Paciente(citas4, "Paseo Colón 3, Donostia", "SS-112233445566",
                "mlopez", "1234", "Miren", "López Arrieta", 600444444));

        return personas;
    }
    /**
     * Busca un usuario en la lista de personas según el nombre de usuario y la contraseña proporcionados.
     *
     * @param user El nombre de usuario a buscar.
     * @param contrasena La contraseña asociada al usuario.
     * @param personas La lista de personas donde se realizará la búsqueda.
     * @return La persona encontrada o null si no se encuentra ninguna coincidencia.
     */
    @Override
    public Persona buscar(String user, String contrasena,
            ArrayList<Persona> personas
    ) {
        Persona p = null;
        boolean encontrado = false;
        for (int i = 0; i < personas.size() && !encontrado; i++) {
            if (personas.get(i).getUser().equals(user) && personas.get(i).getContrasena().equals(contrasena)) {
                p = personas.get(i);
                encontrado = true;
            }
        }
        return p;
    }
    /**
     * Actualiza los datos de una persona en la lista de personas según el nombre y apellido proporcionados.
     * @params persona La persona con los nuevos datos.
     * @param nombre El nombre de la persona a actualizar.
     * @param apellido El apellido de la persona a actualizarse.
     * @param personas La lista de personas donde se realizará la actualización.
     * @return La lista de personas actualizada.
     */
    @Override
    public ArrayList<Persona> actualizar(Persona persona, String nombre, String apellido, ArrayList<Persona> personas) {
        Medico medicoNuevo = null;
        Paciente pacienteNuevo = null;
        if (persona instanceof Medico) {
            medicoNuevo = (Medico) persona;
        } else {
            pacienteNuevo = (Paciente) persona;
        }
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().equals(nombre) && personas.get(i).getApellidos().equalsIgnoreCase(apellido)) {
                personas.remove(i);
                if (personas.get(i) instanceof Medico) {
                    personas.add(new Medico(medicoNuevo.getEspecialidad(), medicoNuevo.getNumeroDeSala(), medicoNuevo.getHorario(), medicoNuevo.getUser(), medicoNuevo.getContrasena(), medicoNuevo.getNombre(), medicoNuevo.getApellidos(), medicoNuevo.getTelefono()));
                } else {
                    personas.add(new Paciente(pacienteNuevo.getCitas(), pacienteNuevo.getDirecion(), pacienteNuevo.getNumSeguridadSocial(), pacienteNuevo.getUser(), pacienteNuevo.getContrasena(), pacienteNuevo.getNombre(), pacienteNuevo.getApellidos(), pacienteNuevo.getTelefono()));
                }
            }
        }
        return personas;
    }

}
