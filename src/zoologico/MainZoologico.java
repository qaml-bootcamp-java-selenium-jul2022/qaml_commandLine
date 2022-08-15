package zoologico;

public class MainZoologico {

    public static void main(String[] args){

        HabitatTerrestre leon = new Leon();
        leon.setNombreanimal("Leon");
        System.out.println(leon.getNombreanimal());
        leon.setTipoanimal("Animal Terrestre");
        System.out.println(leon.getHabitat());
        System.out.println(leon.getTipoanimal());
        leon.setAltura(2.1);
        System.out.println(leon.getAltura()+" mts");
        leon.setPeso(200.23);
        System.out.println(leon.getPeso()+" kgs");
        leon.infoHabitatTerrestre();
        leon.TipoDeDesplazamiento();
        leon.TipoDeDieta();
        System.out.println("");

        Acuario delfin = new Delfin();
        delfin.setNombreanimal("Delfin");
        System.out.println(delfin.getNombreanimal());
        delfin.setTipoanimal("Animal Acuatico");
        System.out.println(delfin.getHabitat());
        System.out.println(delfin.getTipoanimal());
        delfin.setAltura(1.1);
        System.out.println(delfin.getAltura()+" mts");
        delfin.setPeso(100.50);
        System.out.println(delfin.getPeso()+" kgs");
        delfin.infoHabitatAcuatico();
        delfin.TipoDeDesplazamiento();
        delfin.TipoDeDieta();
        System.out.println("");

        Reptilario serpiente = new SerpienteCascabel();
        serpiente.setNombreanimal("Serpiente de Cascabel");
        System.out.println(serpiente.getNombreanimal());
        serpiente.setTipoanimal("Reptil");
        System.out.println(serpiente.getHabitat());
        System.out.println(serpiente.getTipoanimal());
        serpiente.setAltura(30);
        System.out.println(serpiente.getAltura()+" cms");
        serpiente.setPeso(40);
        System.out.println(serpiente.getPeso()+" kgs");
        serpiente.infoHabitatReptil();
        serpiente.TipoDeDesplazamiento();
        serpiente.TipoDeDieta();
        System.out.println("");

        Aviario pavorreal = new Pavorreal();
        pavorreal.setNombreanimal("Pavorreal");
        System.out.println(pavorreal.getNombreanimal());
        pavorreal.setTipoanimal("Ave");
        System.out.println(pavorreal.getHabitat());
        System.out.println(pavorreal.getTipoanimal());
        pavorreal.setAltura(30);
        System.out.println(pavorreal.getAltura()+" cms");
        pavorreal.setPeso(40);
        System.out.println(pavorreal.getPeso()+" kgs");
        pavorreal.infoHabitatAviario();
        pavorreal.TipoDeDesplazamiento();
        pavorreal.TipoDeDieta();

        //EJERCICIOS DE EQUALS AND TOSTRING
        System.out.println("\n-----------------EJERCICIO DE AVESTRUZ - EQUALS AND TOSTRING-------------------");
        //Avestruz Hortencia = new Avestruz("Emú","Ñandú");
        Avestruz Hortencia = new Avestruz("Emu","Nandu");
        Hortencia.setNombreanimal("Hortencia");
        System.out.println("La Avestruz se llama: "+Hortencia.getNombreanimal());
        System.out.println(Hortencia.toString());
        System.out.println(Hortencia.equals(Hortencia.propiedadAvestrus2)
                ? "Las propiedades recibidas del Avestruz son iguales"
                : "Las propiedades del Avestruz son diferentes");


        Avestruz Molly = new Avestruz("Gallina","Gallina");
        Molly.setNombreanimal("Molly");
        System.out.println("La Avestruz se llama: "+Molly.getNombreanimal());
        System.out.println(Molly.toString());
        System.out.println(Molly.equals(Molly.propiedadAvestrus2)
                ? "Las propiedades recibidas del Avestruz son iguales"
                : "Las propiedades del Avestruz son diferentes");
    }

}
