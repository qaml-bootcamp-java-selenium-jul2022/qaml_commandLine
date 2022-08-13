package EjercicioMapa;

import java.util.HashMap;
import java.util.Map;

public class MapaEducacion {

    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<String, String>();
        mapa = mapaEscuela(mapa);
        //System.out.println(mapa.get("Primaria"));
        System.out.println("Gil estudio en la Primaria: "+mapaEscuela(mapa).get("Primaria Gil"));
        System.out.println("Gil estudio en la Secundaria: "+mapaEscuela(mapa).get("Secundaria  Gil"));
        System.out.println("Gil estudio en la Preparatoria: "+mapaEscuela(mapa).get("Preparatoria  Gil"));
        System.out.println("Gil estudio en la Universidad: "+mapaEscuela(mapa).get("Universidad  Gil"));
        System.out.println("Judy estudio en la Primaria: "+mapaEscuela(mapa).get("Primaria Judy"));
    }

    public static Map<String, String> mapaEscuela(Map<String,String> mapa){
        mapa.put("Primaria Gil","Manuel Gonzalez");
        mapa.put("Secundaria Gil","Colegio Begsu");
        mapa.put("Preparatoria ","Jose Vasconcelos");
        mapa.put("Universidad Gil","Universidad Autonoma de Sinaloa");
        mapa.put("Primaria Judy","Primo Verdad");
        return  mapa;
    }


}
