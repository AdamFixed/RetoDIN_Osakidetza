package com.din.retodin_osakidetza.Modelo;

import java.util.ArrayList;

/**
 * Clase que representa a un paciente en el sistema.
 * 
 * @author AdamFixed
 */
public class Paciente extends Persona {

    
    private ArrayList<String> citas;
    private String direcion;
    private String numSeguridadSocial;

    public Paciente() {
        super();
        this.citas = new ArrayList<>();
    }

    public Paciente(ArrayList<String> citas, String direcion, String numSeguridadSocial, String user, String contrasena, String nombre, String apellidos, int telefono) {
        super(user, contrasena, nombre, apellidos, telefono);
        this.citas = citas;
        this.direcion = direcion;
        this.numSeguridadSocial = numSeguridadSocial;
    }

    
    /**
     * Coge la lista de citas del paciente.
     *
     * @return La lista de citas del paciente.
     */
    public ArrayList<String> getCitas() {
        return citas;
    }
    /**
     * Establece la lista de citas del paciente.
     *
     * @param citas La lista de citas del paciente a establecer.
     */
    public void setCitas(ArrayList<String> citas) {
        this.citas = citas;
    }
    /**
     * Coge la dirección del paciente.
     *
     * @return La dirección del paciente.
     */
    public String getDirecion() {
        return direcion;
    }
    /**
     * Establece la dirección del paciente.
     *
     * @param direcion La dirección del paciente a establecer.
     */
    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }
    /**
     * Coge el numero de seguridad social del paciente.
     *
     * @return El número de seguridad social del paciente.
     */
    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }
    /**
     * Establece el número de seguridad social del paciente.
     *
     * @param numSeguridadSocial El número de seguridad social del paciente a establecer.
     */
    public void setNumSeguridadSocial(String numSeguridadSocial) {
        this.numSeguridadSocial = numSeguridadSocial;
    }
}
