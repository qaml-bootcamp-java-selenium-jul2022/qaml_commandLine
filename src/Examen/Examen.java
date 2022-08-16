package Examen;

import EjercicioVideojuego.Elfo;

import java.util.Map;
import java.util.TreeMap;

public class Examen {

    public static void main(String args[]) {
        Map<Integer, String> alumnos = new TreeMap<>();
        alumnos.put(1, "Judy");
        alumnos.put(2, "Gil");
        alumnos.put(3, "Susy");
        alumnos.put(4, "Alvaro");
        alumnos.put(5, "Joaquin");
        alumnos.put(6, "Monse");
        alumnos.put(7, "Gerry");

        for (int i = 1; i < alumnos.size(); i++) {

            System.out.println("El nombre del alumno es :" + alumnos.get(i));


        }

    }

}
