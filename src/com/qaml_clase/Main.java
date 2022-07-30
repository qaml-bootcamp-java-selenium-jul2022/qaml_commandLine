package com.qaml_clase;

import EjercicioVideojuego.Elfo;
import Transportes.AutobusPasajeros;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person trabajadorSalarioMinimo = new Person();
        Person trabajadorOficinista = new Person();

        trabajadorSalarioMinimo.setName("otro nombre");
        String nombreSalarioMinimo = trabajadorSalarioMinimo.getName();
        System.out.println(nombreSalarioMinimo);

        String nombreOficinista = trabajadorOficinista.getName();
        System.out.println(nombreOficinista);
        System.out.println(trabajadorOficinista.getName());

        System.out.println(trabajadorOficinista.Salary());
        System.out.println(trabajadorSalarioMinimo.Salary());

        //Ejercicios medios de transporte

        AutobusPasajeros autobusPrimeraPlus = new AutobusPasajeros();
        autobusPrimeraPlus.Acelerar();
        autobusPrimeraPlus.usarTrasmision();

        Elfo elfo1 = new Elfo();
        elfo1.Mago();
    }
}
