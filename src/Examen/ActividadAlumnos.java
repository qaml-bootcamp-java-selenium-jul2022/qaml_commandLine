package Examen;

import java.util.HashSet;
import java.util.Set;

public class ActividadAlumnos {

    public static void main(String[] args){
        Set<String> strings = new HashSet<>();
        strings.add("Judy Rizo");
        strings.add("Susana Flores");
        strings.add("Alvaro Meraz");
        strings.add("Luis Muñoz");
        strings.add("Gilberto Lizarraga");
        strings.add("Monsse Vargas");
        strings.add("Joaquin Nahuz");
                strings.stream().forEach(e -> System.out.println(e));
    }
}
