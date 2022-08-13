package EjerciciosCollecciones;

import TareaVideojuego.Elfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainEjerciciosCollecciones {

    public static void main(String[] args) {
        Elfo elfo1 = new Elfo("Jenny");
        Elfo elfoJava =  new Elfo("Java");

        //Ejercicio DE COLLECCION - TREEMAP
        System.out.println("\n-----------------EJERCICIO DE COLLECCION - TREEMAP-------------------");
        //Se crea map con dos valores <Key, Value>, los valores se agregan y se ordenan conforme su key,
        //si se mandan dos key iguales, se sobreesribe el valor
        Map<Integer, Elfo>  mapaDeElfos=  new TreeMap<>();

        mapaDeElfos.put(2, elfo1);
        mapaDeElfos.put(3, elfoJava);

        System.out.println("Numero de Elfos: "+mapaDeElfos.size());

        System.out.println(mapaDeElfos.get(1)); //null
        System.out.println(mapaDeElfos.get(2));
        System.out.println(mapaDeElfos.get(3));


        //Ejercicio DE COLLECCION - TREEMAP
        System.out.println("\n-----------------EJERCICIO DE COLLECCION - TREEMAP-------------------");
        Map<String, Integer> mapaCadenaEntero = new TreeMap<>();
        mapaCadenaEntero.put("Home",1234);

        System.out.println(mapaCadenaEntero.get("Home"));

        //Ejercicio DE COLLECCION - List of Elfos
        System.out.println("\n-----------------EJERCICIO DE COLLECCION - LIST of Elfo -------------------");
        List<Elfo> listaDeElfo = new ArrayList<>();
        //add anade elementos al final de la lista, no puede sobreescribir ya que no tiene key
        listaDeElfo.add(elfo1);
        listaDeElfo.add(1, elfoJava);

        //Iterando Lista de Elfos
        for (Elfo elfo: listaDeElfo) {
            System.out.println("Iterando lista de elfo, nomber: "+elfo.toString());
        }

        //Ejercicio DE COLLECCION - List of String
        System.out.println("\n-----------------EJERCICIO DE COLLECCION - LIST of Strings-------------------");
        List<String> listaDeCadenas = new ArrayList<>();
        listaDeCadenas.add("Esta ");
        listaDeCadenas.add("es ");
        listaDeCadenas.add("una lista");

        for (String cadenaEnLista : listaDeCadenas) {
            System.out.println(cadenaEnLista);

        }

        for(int i=0; i< listaDeCadenas.size(); i++){
            System.out.println(listaDeCadenas.get(i));
        }

        //Ejercicio DE COLLECCION - Enum and TreeMap
        System.out.println("\n-----------------EJERCICIO DE COLLECCION - Enum and TreeMap-------------------");
        System.out.println("Susy Estudio la Preparatoria en: "+nombreEscuela(Nombres.SUSY_PRAPARATORIA));
        System.out.println("Judy Estudio la Preparatoria en: "+nombreEscuela(Nombres.JUDY_PRAPARATORIA));
}

    public static String nombreEscuela (Nombres nombres){
        Map<Nombres, String> mapaEscuelas = new TreeMap<>();
        mapaEscuelas.put(Nombres.SUSY_PRIMARIA,"Escuela Centenario");
        mapaEscuelas.put(Nombres.SUSY_SECUNDARIA,"Jesus Romero Flores");
        mapaEscuelas.put(Nombres.SUSY_PRAPARATORIA,"CETIS 100");
        mapaEscuelas.put(Nombres.SUSY_UNIVERSIDAD,"Universidad Cuahutemoc");
        mapaEscuelas.put(Nombres.JUDY_PRIMARIA,"Primo Verdad");
        mapaEscuelas.put(Nombres.JUDY_SECUNDARIA,"Sec Gral No 3. Congreso de Anahuac");
        mapaEscuelas.put(Nombres.JUDY_PRAPARATORIA,"CBTIS 168");
        mapaEscuelas.put(Nombres.JUDY_UNIVERSIDAD,"Universidad Autonoma de Aguascalientes");
        return mapaEscuelas.get(nombres);
    }
}
