package Examen;

import java.util.HashMap;
import java.util.Map;

public class NombreAlumnos {
    public static void main(String args[]) {

    Map<Integer, String> nombrealumnos = new HashMap<Integer, String>();
        nombrealumnos.put(1,"Gilberto");
        nombrealumnos.put(2,"Alvaro");
        nombrealumnos.put(3,"Judy");
        nombrealumnos.put(4,"Susy");
        nombrealumnos.put(5,"Monse");
        nombrealumnos.put(6,"Joaquin");
        nombrealumnos.put(7,"Gerry");


        for(int i=1;  i<=nombrealumnos.size(); i++ ){
            System.out.println(nombrealumnos.get(i));
        }


    }
}
