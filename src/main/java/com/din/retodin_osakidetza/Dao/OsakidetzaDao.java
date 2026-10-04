/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.din.retodin_osakidetza.Dao;

import com.din.retodin_osakidetza.Modelo.Persona;
import java.util.ArrayList;

/**
 * Interfaz que define los métodos para la gestión de datos de osakidetza.
 * 
 * @author asola
 */
public interface OsakidetzaDao {
    /**
     * Llena la lista de personas con datos de ejemplo.
     *
     * @return Una lista de personas con datos de ejemplo..
     */
    public ArrayList<Persona> fillData();
    /**
     * Busca un usuario en la lista de personas según el nombre de usuario y la contraseña proporcionados.
     *
     * @param user El nombre de usuario a buscar.
     * @param contrasena La contraseña asociada al usuario.
     * @param personas La lista de personas donde se realizará la búsqueda.
     * @return La persona encontrada o null si no se encuentra ninguna coincidencia.
     */
    public Persona buscar(String user, String contrasena, ArrayList<Persona> personas);
    /**
     * Actualiza los datos de una persona en la lista de personas según el nombre y apellido proporcionados.
     *
     * @param persona La persona con los nuevos datos.
     * @param nombre El nombre de la persona a actualizar.
     * @param apellido El apellido de la persona a actualizarse.
     * @param personas La lista de personas donde se realizará la actualización.
     * @return La lista de personas actualizada.
     */
    public ArrayList<Persona> actualizar(Persona persona, String nombre, String apellido, ArrayList<Persona> personas);
    
}
