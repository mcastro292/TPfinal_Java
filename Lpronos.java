/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Grupo 8
 */
public class Lpronos {
    //PRONOSTICO

    public List<Persona> Lpron(File g) throws FileNotFoundException {
        List<Pronostico> partidos = new ArrayList();

        List<Persona> perlist = new ArrayList();
        try (Scanner sc = new Scanner(g)) {
            sc.useDelimiter("[ ,\r\n]");
            String ronda;
            String nombre;
            String eq1;
            String eq2;
            int g1 = 0;
            int g2 = 0;

            while (sc.hasNextLine()) {

                ronda = sc.next();
                nombre = sc.next();
                eq1 = sc.next();
                eq2 = sc.next();
                g1 = sc.nextInt();
                g2 = sc.nextInt();

                Equipo e1 = new Equipo(eq1);
                Equipo e2 = new Equipo(eq2);
                Persona per = new Persona(nombre);

                Partido part = new Partido(e1, e2, g1, g2);
                Pronostico pron = new Pronostico(part);
                int a = part.Resultado(part);
                pron.setResultado(a);
                partidos.add(pron);

                per.setPron(pron);
                perlist.add(per);

                if (!sc.hasNextLine()) {
                    break;

                }
                sc.nextLine();

            }

            sc.close();
        }

        return perlist;
    }
}
