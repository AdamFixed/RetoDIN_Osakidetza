package com.din.retodin_osakidetza.Modelo;


import java.util.ArrayList;

public class Usuario extends Persona {

    private ArrayList<String> citas;
    private String direcion;
    private String numSeguridadSocial;

    public Usuario() {
        super();
        this.citas = new ArrayList<>();
    }

    public Usuario(String user, String contrasena, int telefono, ArrayList<String> citas, String direcion, String numSeguridadSocial) {
        super(user, contrasena, telefono);
        this.citas  = citas;
        this.direcion = direcion;
        this.numSeguridadSocial = numSeguridadSocial;
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