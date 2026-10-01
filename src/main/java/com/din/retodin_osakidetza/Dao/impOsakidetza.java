/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.din.retodin_osakidetza.Dao;

import com.din.retodin_osakidetza.Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author asola
 */
public class impOsakidetza implements OsakidetzaDao{

    public static ArrayList<Persona> llenarDatos() {
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        Admin admin1 = new Admin("admin1", "pass123", 600111222, 1);
        Admin admin2 = new Admin("admin2", "secure456", 600333444, 2);

        ArrayList<String> citasU1 = new ArrayList<>();
        citasU1.add("2026-10-10 10:00 - Consulta General");
        Usuario usuario1 = new Usuario("jperez", "userpass1", 611222333, citasU1, "Calle Mayor 12", "SS-12345678");

        Usuario usuario2 = new Usuario("mgarcia", "userpass2", 622333444, new ArrayList<>(), "Avenida del Sol 45", "SS-87654321");

        Medico medico1 = new Medico("dr_smith", "medico123", 633444555, "Cardiología", 102, "Mañanas (08:00 - 15:00)");
        Medico medico2 = new Medico("dra_lopez", "medico456", 644555666, "Pediatría", 205, "Tardes (15:00 - 22:00)");

        listaPersonas.add(admin1);
        listaPersonas.add(admin2);
        listaPersonas.add(usuario1);
        listaPersonas.add(usuario2);
        listaPersonas.add(medico1);
        listaPersonas.add(medico2);

        return listaPersonas;
    }
}
