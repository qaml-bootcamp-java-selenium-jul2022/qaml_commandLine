package EjerciciosColecciones;

import EjercicioVideojuego.Elfo;
import sun.lwawt.macosx.CSystemTray;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainEjerciciosColecciones {
    public static void main(String args[]) {
        Map<Integer, Elfo> mapaDeElfos = new TreeMap<>();

        Elfo elfo1 = new Elfo("Jenny");
        Elfo elfoJava = new Elfo("Java");

        mapaDeElfos.put(2, elfo1);
        mapaDeElfos.put(3, elfoJava);

        System.out.println("Numero de Elfos: " + mapaDeElfos.size());

        System.out.println(mapaDeElfos.get(2));
        System.out.println(mapaDeElfos.get(1));
        System.out.println(mapaDeElfos.get(3));

        Map <String, Integer> mapaCadenaEntero = new TreeMap<>();
        mapaCadenaEntero.put("Home", 1234);

        System.out.println(mapaCadenaEntero.get("Home"));

        List<Elfo> listaDeElfos = new ArrayList<>();
        listaDeElfos.add(elfoJava);
        listaDeElfos.add(elfo1);

        //Iterando la listaDeElfos con foreach
        for (Elfo elfo : listaDeElfos) {
            System.out.println("Iterando lista de elfo " + elfo.toString());
        }

        List<String> listaDeCadenas = new ArrayList<>();
        listaDeCadenas.add("Esta");
        listaDeCadenas.add("es");
        listaDeCadenas.add("una lista");

        //Iterando listaDeCadenas con foreach
        for (String cadenaEnLista : listaDeCadenas) {
            System.out.println(cadenaEnLista);
        }

        //Iterando listaDeCadenas con for
        for (int i = 0; i < listaDeCadenas.size(); i++) {
            System.out.println(listaDeCadenas.get(i));
        }
    }
}
