package com.qaml_clase;

public class Person {
    //El atributo será encapsulado y necesita ser privado
    private String name = "Nombre default";
    private Double salarioMinimoMensual = 3500.89;
    private Double taxPorcentaje = 0.30;

    public Double BasicPay;

    //Getter (método para obtener el valor de name)
    public String getName () {
        System.out.println("Regresando el valor de name");
        return name;
    }

    //Setter (método para establecer el valor de name)
    public void setName (String nuevoNombre) {
        System.out.println("Estableciendo el nuevo valor de name");
        this.name = nuevoNombre;
    }

    public Double Salary() {
        return calculoDeSalarioNeto();
    }

    public Double Tax() {
        return null;
    }

    private Double calculoDeSalarioNeto() {
        //Restando los impuestos al salario minimo mensual
        System.out.println("Restando los impuestos");
        return this.salarioMinimoMensual - this.calculoDeImpuestos();
    }

    private Double calculoDeImpuestos() {
        //Calculando el porcentaje de impuestos
        System.out.println("Cálculo de porcentaje de impuestos en base al salario");
        return this.salarioMinimoMensual * this.taxPorcentaje;
    }
}
