/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Grupo 8
 */
public class Partido {

    private Equipo equipo1;
    private Equipo equipo2;
    private int golequip1;
    private int golequip2;

    public Partido(Equipo equipo1, Equipo equipo2, int golequip1, int golequip2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golequip1 = golequip1;
        this.golequip2 = golequip2;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolequip1() {
        return golequip1;
    }

    public void setGolequip1(int golequip1) {
        this.golequip1 = golequip1;
    }

    public int getGolequip2() {
        return golequip2;
    }

    public void setGolequip2(int golequip2) {
        this.golequip2 = golequip2;
    }

    @Override
    public String toString() {
        return equipo1 + " vs " + equipo2 + " local: " + golequip1 + " Visitante: " + golequip2;
    }

    public int Resultado(Partido p1) {
        int golequip1 = p1.getGolequip1();
        int golequip2 = p1.getGolequip2();
        int resultado = 0;
        if (golequip1 > golequip2) {
            resultado = 1;

            return resultado;

        }
        if (golequip1 == golequip2) {
            resultado = 0;

            return resultado;

        }
        if (golequip1 < golequip2) {
            resultado = -1;

            return resultado;

        }
        return 0;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.golequip1;
        hash = 23 * hash + this.golequip2;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Partido other = (Partido) obj;
        if (this.golequip1 != other.golequip1) {
            return false;
        }
        return this.golequip2 == other.golequip2;
    }

}
