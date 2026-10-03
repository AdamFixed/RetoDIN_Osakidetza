/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.din.retodin_osakidetza.Modelo;

/**
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

    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumeroDeSala() {
        return numeroDeSala;
    }

    public void setNumeroDeSala(int numeroDeSala) {
        this.numeroDeSala = numeroDeSala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
