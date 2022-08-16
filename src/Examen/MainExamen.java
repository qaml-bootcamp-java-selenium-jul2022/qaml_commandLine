package Examen;

import Examen.Nombres_Alumnos;


import java.util.Map;
import java.util.TreeMap;

import static Examen.Nombres_Alumnos.*;

public class MainExamen {

    public static void main(String args[]) {
        //EJERCICIOS EXAMEN - Escribir un programa que imprima (System.out.prinln) el nombre de cada uno de los alumnos usando una colección de Java
        System.out.println("\n-----------------EJERCICIO DE Examen - Nombre de Alumnos-------------------");

        Map<Nombres_Alumnos, String> CursoQALabs = new TreeMap<>();
        CursoQALabs = llenarMap(CursoQALabs);

        System.out.println("Nombre de alumnos del curso de QA Mind Labs:");
        System.out.println(CursoQALabs.get(ALVARO));
        System.out.println(CursoQALabs.get(GIL));
        System.out.println(CursoQALabs.get(GERRY));
        System.out.println(CursoQALabs.get(JENNY));
        System.out.println(CursoQALabs.get(JOAQUIN));
        System.out.println(CursoQALabs.get(JUDY));
        System.out.println(CursoQALabs.get(MONSSE));
        System.out.println(CursoQALabs.get(SUSY));

    }

    static Map<Nombres_Alumnos, String> llenarMap( Map<Nombres_Alumnos, String> CursoQALabs){
        CursoQALabs.put(Nombres_Alumnos.ALVARO, "Alvaro Meraz");
        CursoQALabs.put(GIL, "Gilberto Lizarraga Barraza");
        CursoQALabs.put(GERRY, "Luis Gerardo Munos");
        CursoQALabs.put(JENNY, "Jeniffer Ramierez");
        CursoQALabs.put(JOAQUIN, "Joaquin");
        CursoQALabs.put(JUDY, "Judith Elizabeth Rizo Padilla");
        CursoQALabs.put(MONSSE, "Monsse Vargas");
        CursoQALabs.put(SUSY, "Susana Elizabeth Zapari Flores");

        return CursoQALabs;
    }

}
