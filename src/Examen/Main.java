package Examen;

import EjerciciosColecciones.Nombres;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

            List<String> Alumno = new ArrayList<>();
            Alumno.add("Monse");
            Alumno.add("Judy");
            Alumno.add("Joaquin");
            Alumno.add("Gilberto");
            Alumno.add("Gerardo");
            Alumno.add("Alvaro");
            Alumno.add("Susy");

        for (String alumno : Alumno) {
            System.out.println(alumno);
        }
        }
    }
