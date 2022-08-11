package com.qaml_clase;

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

        Person alumno;
        PersonaEstatica.esteMetodoEsEstatico();
        System.out.println(PersonaEstatica.nombrePersonaEstatica);

    }
}
