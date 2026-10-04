/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.din.retodin_osakidetza.Modelo;

/**
 * Clase que representa a un médico en el sistema.
 * 
 * @author asola
 */
public class Medico extends Persona {

    private String especialidad;
    private int numeroDeSala;
    private String horario;

    public Medico() {
        super();
    }

    public Medico(String especialidad, int numeroDeSala, String horario, String user, String contrasena, String nombre, String apellidos, int telefono) {
        super(user, contrasena, nombre, apellidos, telefono);
        this.especialidad = especialidad;
        this.numeroDeSala = numeroDeSala;
        this.horario = horario;
    }

    
    /**
     * Coge la especialidad del médico.
     *
     * @return La especialidad del médico.
     */
    public String getEspecialidad() {
        return especialidad;
    }
    /**
     * Establece la especialidad del médico.
     *
     * @param especialidad La especialidad del médico a establecer.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    /**
     * Coge el número de sala del médico.
     *
     * @return El número de sala del médico.
     */
    public int getNumeroDeSala() {
        return numeroDeSala;
    }
    /**
     * Establece el número de sala del médico.
     *
     * @param numeroDeSala El número de sala del médico a establecer.
     */
    public void setNumeroDeSala(int numeroDeSala) {
        this.numeroDeSala = numeroDeSala;
    }
    /**
     * Coge el horario del médico.
     *
     * @return El horario del médico.
     */
    public String getHorario() {
        return horario;
    }
    /**
     * Establece el horario del médico.
     *
     * @param horario El horario del médico a establecer.
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }
}
