/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Grupo 8
 */
public class Pronostico {

    private Partido partido;
    private int resultado;

    public Pronostico(Partido partido) {

        this.partido = partido;

    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Pronostico{" + "partido=" + partido + resultado + '}';
    }

    public int comparar(Partido p1) {
        int puntos = 0;

        if (resultado == partido.Resultado(partido)) {
            puntos = 1;
            System.out.println("gano un punto");
        }
        return puntos;
    }
}
