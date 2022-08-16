package ExamenAlvaro;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


public class ExamenAlumnos {
    public static void main (String [] args){
        List<String> alumnosCurso = new ArrayList<>();
        alumnosCurso.add("Gil");
        alumnosCurso.add("Joaquin");
        alumnosCurso.add("Judy");
        alumnosCurso.add("Susy");
        alumnosCurso.add("Gerry");
        alumnosCurso.add("Monse");
        alumnosCurso.add("Alvaro");

        System.out.println("Alumnos del curso Java-QAMinds");

        for (String nombreAlumno: alumnosCurso) {
            System.out.println(nombreAlumno);
        }





    }
}
