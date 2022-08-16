package Examen;


import EjercicioVideojuego.Elfo;

import java.util.ArrayList;
import java.util.List;

public class Examen {
    public static void main(String args[]) {
        List<String> listaDeAlumnos = new ArrayList<>();
        listaDeAlumnos.add("Monsse");
        listaDeAlumnos.add("Susy");
        listaDeAlumnos.add("Jucy");
        listaDeAlumnos.add("Luis Gerardo");
        listaDeAlumnos.add("Joaquin");
        listaDeAlumnos.add("Alvaro");
        listaDeAlumnos.add("Gilberto");

        for (String alumno : listaDeAlumnos) {
            System.out.println("Alumno " + alumno.toString());
        }
    }
}
