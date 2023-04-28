/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.List;


/**
 *
 * @author Grupo 8
 */
public class Tpfinal {

    public static void main(String[] args) throws FileNotFoundException  {

        List<Ronda> a = new ArrayList();
        List<Persona> b = new ArrayList();

        File f = new File("C:\\Users\\MARTIN\\resultados.txt");
        File g = new File("C:\\Users\\MARTIN\\pronostico.txt");
        Lector n = new Lector();
        Lpronos t = new Lpronos();
        a = n.LectorRonda(f);

        b = t.Lpron(g);


        List<Persona> perlist = new ArrayList();

        total l = new total();

        perlist = l.totalpuntos(a, b);
        for (Persona person : perlist) {
            System.out.println(person);
        }

    }

}
