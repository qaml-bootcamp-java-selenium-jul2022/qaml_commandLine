package Zoologico;

public class Main {

    public static void main(String[] args) {

        Acuario delfin = new Acuario();
        delfin.dormir();
        delfin.comer();
        delfin.nadar();
        delfin.color = "Gris";
        delfin.peso = 40.5;
        delfin.edad = 15;
        delfin.genero = "Hembra";
        System.out.println(delfin.color);
        System.out.println(delfin.peso);
        System.out.println(delfin.edad);
        System.out.println(delfin.genero);

        AnimalesTerrestres leon = new AnimalesTerrestres();
        leon.dormir();
        leon.comer();
        leon.escalar();
        leon.color = "Dorado";
        leon.peso = 100.5;
        leon.edad = 40;
        leon.genero = "Macho";
        System.out.println(leon.color);
        System.out.println(leon.peso);
        System.out.println(leon.edad);
        System.out.println(leon.genero);

        Aviario pavorreal = new Aviario();
        pavorreal.dormir();
        pavorreal.comer();
        pavorreal.volar();
        pavorreal.color = "Azul turquesa";
        pavorreal.peso = 20.8;
        pavorreal.edad = 20;
        pavorreal.genero = "Hembra";
        System.out.println(pavorreal.color);
        System.out.println(pavorreal.peso);
        System.out.println(pavorreal.edad);
        System.out.println(pavorreal.genero);

        Reptilario serpienteDeCascabel = new Reptilario();
        serpienteDeCascabel.dormir();
        serpienteDeCascabel.comer();
        serpienteDeCascabel.asolearse();
        serpienteDeCascabel.color = "negra";
        serpienteDeCascabel.peso = 5.7;
        serpienteDeCascabel.edad = 3;
        serpienteDeCascabel.genero = "Hembra";
        System.out.println(serpienteDeCascabel.color);
        System.out.println(serpienteDeCascabel.peso);
        System.out.println(serpienteDeCascabel.edad);
        System.out.println(serpienteDeCascabel.genero);

    }
}
