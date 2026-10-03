/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.din.retodin_osakidetza.Dao;

import com.din.retodin_osakidetza.Modelo.Persona;
import java.util.ArrayList;

/**
 *
 * @author asola
 */
public interface OsakidetzaDao {
    
    public ArrayList<Persona> fillData();
    public Persona buscar(String user, String contrasena, ArrayList<Persona> personas);
    public ArrayList<Persona> actualizar(Persona persona, String nombre, String Apellido, ArrayList<Persona> personas);
    
}
