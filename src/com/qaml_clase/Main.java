package com.qaml_clase;

//import TransportesJenny.TransporteAereo;
import Transportes.AutobusPasajeros;
import Videojuego.Elfo;
import Videojuego.Enano;
import Videojuego.Humano;
import Zoologico.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //TESTING PERSON IN COM.QAML_CLASS PACKAGE
        System.out.println("\n-----------------EJERCICIO DE PERSON-------------------");
        final Person trabajadorSalarioMinimo = new Person();
        Person trabajadorOficinista = new Person();

        trabajadorSalarioMinimo.setName("Test main branch");
        String nombreSalarioMinimo = trabajadorSalarioMinimo.getName();
        System.out.println(nombreSalarioMinimo);

        String nombreOficinista = trabajadorOficinista.getName();
        System.out.println(nombreOficinista);
        System.out.println(trabajadorOficinista.getName());

        System.out.println(trabajadorOficinista.Salary());
        System.out.println(trabajadorSalarioMinimo.Salary());


        //EJERCICIOS DE TRANSPORTES
       /* AutobusPasajeros autobusPrimeraPlus = new AutobusPasajeros();
        autobusPrimeraPlus.Acelerar();
        autobusPrimeraPlus.usarTransmisionManual();*/

        //EJERCICIO DE VIDEOJUEGOS - JENNY
        /*EjercicioVideojuegoJenny.Elfo elfo1 = new EjercicioVideojuegoJenny.Elfo();
        elfo1.Mago();*/

        //EJERCICIO CLASE ESTATICA -  MODIFICADORES DE ACCESO
        System.out.println("\n-----------------EJERCICIO DE CLASE ESTATICA-------------------");
        PersonaEstatica.esteMetodoEsEstatico();
        System.out.println(PersonaEstatica.nombrePersonaEstatica);

        //EJERCICIO DE TRANSPORTES de Jenny
        /*TransporteAereo transporteAereo = new TransporteAereo(2000) {
            @Override
            public void volar() {

            }

            @Override
            public void Acelerar() {

            }
        };*/


        //EJERCICIOS DE TRANSPORTES
        System.out.println("\n-----------------EJERCICIO DE TRANSPORTES-------------------");
        AutobusPasajeros autobusPrimeraPlus = new AutobusPasajeros();
        autobusPrimeraPlus.Acelerar();
        autobusPrimeraPlus.usarTransmisionManual();


        //EJERCICIOS DE VIDEOJUEGOS
        System.out.println("\n-----------------EJERCICIO DE VIDEOJUEGOS-------------------");
        Enano enano1 = new Enano();
        enano1.name="Grimy";
        //enano1.setGuerrero();
        enano1.Guerrero();

        Elfo elfo1 = new Elfo();
        elfo1.name = "Legolas";
        //elfo1.setArquero();
        elfo1.Meditar();
        elfo1.Mago();
        elfo1.Arquero();

        Humano humano1 = new Humano();
        humano1.name = "Aragorn";
        //humano1.setMago();
        humano1.Desplazarse();
        humano1.Guerrero();
        humano1.Arquero();


        //EJERCICIOS DE ZOOLOGICO
        System.out.println("\n-----------------EJERCICIO DE ZOOLOGICO-------------------");
        Leon Leoncio = new Leon();
        Leoncio.setNombre("El Leon se llama Leoncio");
        System.out.println(Leoncio.getNombre());
        Leoncio.setSexo("Masculino");
        Leoncio.getEdad(5);
        Leoncio.setTipoDeAnimal();
        Leoncio.setNumeroPatas();
        Leoncio.setEsCarnivoro();
        Leoncio.sonidoAnimal();
        Leoncio.Atacar();

        Delfin Delfy = new Delfin();
        Delfy.setNombre("El Delfin se llama Delfy");
        System.out.println(Delfy.getNombre());
        Delfy.setSexo("Femenino");
        Delfy.setTipoDeAnimal();
        Delfy.setNumeroAletas();
        Delfy.setProfundidad(105.5);
        Delfy.setTiempoAguantaRespiracion(30);
        Delfy.sonidoAnimal();
        Delfy.nadarProfundidad();

        PavoReal Rey = new PavoReal();
        Rey.setNombre("El Pavo Real se llama Rey");
        System.out.println(Rey.getNombre());
        Rey.setTipoDeAnimal();
        Rey.setLongitudAlas(0.5);
        Rey.setLongitudCola(1.5);
        System.out.println("El pavo real tiene alas de "+Rey.getLongitudAlas()+" metros, y cola de "+
                Rey.getLongitudCola()+" metros");
        Rey.sonidoAnimal();
        Rey.mostarSuCola();

        SerpienteDeCascabel Python = new SerpienteDeCascabel();
        Python.setNombre("La serpiente de Cascabel se llama Python");
        System.out.println(Python.getNombre());
        Python.setTipoDeAnimal();
        System.out.println("La Serpiente tiene "+Python.getNumeroPatas()+" patas");
        Python.setLargo(7.3);
        System.out.println("La Serpiente es "+Python.getLargo()+" metros de larga");
        Python.Arrastrarse();
        Python.mudaDePiel();


    }
}
