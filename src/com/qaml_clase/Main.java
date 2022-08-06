package com.qaml_clase;

import EjercicioVideojuego.Elfo;
import Transportes.AutobusPasajeros;
import Zoologico.*;
import Transportes.TransporteAereo;

public class Main {

    public static void main(String[] args) {
	// write your code here
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

        //Ejercicios medios de transporte

        Transportes.AutobusPasajeros autobusPrimeraPlus = new Transportes.AutobusPasajeros();
        autobusPrimeraPlus.Acelerar();
        autobusPrimeraPlus.usarTrasmision();

        EjercicioVideojuego.Elfo elfo1 = new EjercicioVideojuego.Elfo();
        elfo1.Mago();

        // Ejercicio Zoologico

        PersonaEstatica.esteMetodoEsEstatico();
        System.out.println(PersonaEstatica.nombrePersonaEstatica);

        TransporteAereo transporteAereo = new TransporteAereo(2000) {
            @Override
            public void volar() {

            }

            @Override
            public void Acelerar() {

            }
        };
        Animal leon = new Leon();
        leon.comer();
        Leon leon2 = new Leon();
        leon2.mover();
        Pavorreal pavorreal = new Pavorreal();
        pavorreal.comer();
        pavorreal.mover();
        Delfin delfin = new Delfin();
        delfin.comer();
        delfin.mover();
        SerpienteCascabel serpienteCascabel = new SerpienteCascabel();
        serpienteCascabel.comer();
        serpienteCascabel.mover();

        Person alumno;
        PersonaEstatica.esteMetodoEsEstatico();
        System.out.println(PersonaEstatica.nombrePersonaEstatica);

    }
}
