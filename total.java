/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grupo 8
 */
public class total {

    public List<Persona> totalpuntos(List<Ronda> a, List<Persona> b) {
        int punt = 0;

        List<Persona> perlist = new ArrayList();
        String nombre = "vacio";
        String nombres = "vacio";
        Persona per = new Persona(null);

        for (Persona z : b) {

            Partido part = z.getPron().getPartido();
            int result = part.Resultado(part);
            nombre = z.getNombre();

            for (Ronda i : a) {
                for (Partido p : i.getPartidos()) {
                    String peq1 = part.getEquipo1().toString();
                    String req1 = p.getEquipo1().toString();
                    String peq2 = part.getEquipo2().toString();
                    String req2 = p.getEquipo2().toString();

                    if (peq1.equals(req1) & peq2.equals(req2)) {

                        if (nombres.equals(nombre) | nombres.equals("vacio")) {
                            if (p.Resultado(p) == result) {
                                punt = punt + 1;

                            }

                        } else {

                            per.setNombre(nombres);
                            per.setPuntos(punt);
                            perlist.add(per);

                            if (p.Resultado(p) == result) {
                                punt = 1;

                            } else {
                                punt = 0;
                            }

                        }

                    }

                }
                nombres = z.getNombre();

            }

        }

        Persona seg = new Persona((nombres));
        seg.setPuntos(punt);

        perlist.add(seg);

        return perlist;
    }
}
