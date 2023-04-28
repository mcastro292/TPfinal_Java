/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Grupo 8
 */
public class Lector {

    public List<Ronda> LectorRonda(File f) throws FileNotFoundException {

        List<Ronda> partidos = new ArrayList();

        try (Scanner sc = new Scanner(f)) {
            sc.useDelimiter("[ ,\r\n]");
            String nro;
            String eq1;
            String eq2;
            int g1 = 0;
            int g2 = 0;

            while (sc.hasNextLine()) {

                nro = sc.next();
                eq1 = sc.next();
                eq2 = sc.next();
                g1 = sc.nextInt();
                g2 = sc.nextInt();

                Equipo e1 = new Equipo(eq1);
                Equipo e2 = new Equipo(eq2);

                Partido part = new Partido(e1, e2, g1, g2);
                List<Partido> partid = new ArrayList();
                partid.add(part);

                Ronda ronda = new Ronda(nro, partid);
                partidos.add(ronda);

                if (!sc.hasNextLine()) {
                    break;

                }
                sc.nextLine();

            }

            sc.close();

        }
        return partidos;

    }

}
