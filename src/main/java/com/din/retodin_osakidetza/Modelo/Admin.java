/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.din.retodin_osakidetza.Modelo;

/**
 * Clase que representa a un administrador en el sistema.
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

   
    /**
     * Coge el ID del aadministrador.
     *
     * @return El ID del administrador.
     */
    public int getIdAdmin() {
        return idAdmin;
    }
    /**
     * Establece el ID del administrador.
     *
     * @param idAdmin El ID del administrador a establecer.
     */
    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

}
