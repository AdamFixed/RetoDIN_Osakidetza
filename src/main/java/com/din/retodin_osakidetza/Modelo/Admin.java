/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.din.retodin_osakidetza.Modelo;

/**
 *
 * @author asola
 */
public class Admin extends Persona {

    private int idAdmin;

    public Admin() {
        super();
    }

    public Admin(int idAdmin, String user, String contrasena, String nombre, String apellidos, int telefono) {
        super(user, contrasena, nombre, apellidos, telefono);
        this.idAdmin = idAdmin;
    }

   

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

}
