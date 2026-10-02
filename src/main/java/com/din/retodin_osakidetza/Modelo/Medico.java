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

    private String nombre;
    private String apellidos;
    private String especialidad;
    private int numeroDeSala;
    private String horario;

    public Medico(String nombre, String apellidos, String especialidad, int numeroDeSala, String horario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.numeroDeSala = numeroDeSala;
        this.horario = horario;
    }

    public Medico() {
        super();
        this.nombre = "";
        this.apellidos = "";
        this.especialidad = "";
        this.numeroDeSala = 0;
        this.horario = "";
    }

    public Medico(String user, String contrasena, int telefono, String nombre, String apellidos, String especialidad, int numeroDeSala, String horario) {
        super(user, contrasena, telefono);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.numeroDeSala = numeroDeSala;
        this.horario = horario;
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
