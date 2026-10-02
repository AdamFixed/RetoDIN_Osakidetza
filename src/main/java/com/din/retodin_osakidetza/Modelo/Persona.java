/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.din.retodin_osakidetza.Modelo;

/**
 *
 * @author asola
 */
public abstract class Persona {

    private String user;
    private String contrasena;
    private int telefono;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Persona() {
    }

    // Constructor parametrizado
    public Persona(String user, String contrasena, int telefono) {
        this.user = user;
        this.contrasena = contrasena;
        this.telefono = telefono;
    }

}
