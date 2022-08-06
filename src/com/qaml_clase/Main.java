package com.qaml_clase;

import TransportesJenny.*;

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
        System.out.println("\n-----------------EJERCICIO DE TRANSPORTES - JENNY -------------------");
        AutobusPasajeros autobusPrimeraPlus = new AutobusPasajeros();
        autobusPrimeraPlus.Acelerar();
        autobusPrimeraPlus.usarTrasmision();

        //EJERCICIO DE VIDEOJUEGOS - JENNY
        System.out.println("\n-----------------EJERCICIO DE VIDEOJUEGO - JENNY -------------------");
        EjercicioVideojuegoJenny.Elfo elfo1 = new EjercicioVideojuegoJenny.Elfo();
        elfo1.Mago();


        //EJERCICIO CLASE ESTATICA -  MODIFICADORES DE ACCESO
        System.out.println("\n-----------------EJERCICIO DE CLASE ESTATICA-------------------");

        Person alumno;
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

    }
}
