/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.din.retodin_osakidetza.Modelo;

/**
 * Clase que representa a una persona en el sistema.
 * 
 * @author AdamFixed
 */
public abstract class Persona {

    private String user;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private int telefono;
    /**
     * Coge el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre de la persona.
     *
     * @param nombre El nombre de la persona a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Coge los apellidos de la persona.
     *
     * @return Los apellidos de la persona.
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * Establece los apellidos de la persona.
     *
     * @param apellidos Los apellidos de la persona a establecer.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * Coge el número de teléfono de la persona.
     *
     * @return El número de teléfono de la persona.
     */
    public String getUser() {
        return user;
    }
    /**
     * Establece el nombre de usuario de la persona.
     *
     * @param user El nombre de usuario de la persona a establecer.
     */
    public void setUser(String user) {
        this.user = user;
    }
    /**
     * Coge la contraseña de la persona.
     *
     * @return La contraseña de la persona.
     */
    public String getContrasena() {
        return contrasena;
    }
    /**
     * Establece la contraseña de la persona.
     *
     * @param contrasena La contraseña de la persona a establecer.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Coge el número de teléfono de la persona.
     *
     * @return El número de teléfono de la persona.
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono de la persona.
     *
     * @param telefono El número de teléfono de la persona a establecer.
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public Persona() {
    }

    public Persona(String user, String contrasena, String nombre, String apellidos, int telefono) {
        this.user = user;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

}
