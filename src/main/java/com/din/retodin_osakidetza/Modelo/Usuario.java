package com.din.retodin_osakidetza.Modelo;

import java.util.ArrayList;

public class Usuario extends Persona {

    private String nombre;
    private String apellidos;
    private ArrayList<String> citas;
    private String direcion;
    private String numSeguridadSocial;

    public Usuario() {
        super();
        this.nombre = "";
        this.apellidos = "";
        this.citas = new ArrayList<>();
        this.direcion = "";
        this.numSeguridadSocial = "";
    }

    public Usuario(String user, String contrasena, int telefono, String nombre, String apellidos, ArrayList<String> citas, String direcion, String numSeguridadSocial) {
        super(user, contrasena, telefono);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.citas = citas;
        this.direcion = direcion;
        this.numSeguridadSocial = numSeguridadSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ArrayList<String> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<String> citas) {
        this.citas = citas;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public void setNumSeguridadSocial(String numSeguridadSocial) {
        this.numSeguridadSocial = numSeguridadSocial;
    }
}
