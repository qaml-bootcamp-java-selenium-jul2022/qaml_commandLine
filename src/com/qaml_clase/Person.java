package com.qaml_clase;

public class Person implements IPersona {
    //El atributo será encapsulado y necesita ser privado
    private String name = "Nombre default";
    private Double salarioMinimoMensual = 3500.89;
    private Double taxPorcentaje = 0.30;
    private int idDePersona;
    public String Titulo = "Titulo test";
    public final String variableFinal = "Esta variable no se puede modificar porque es final";

    public Double BasicPay;

    public Person (int id){
        //Validacion del identificador en la base de datos
        boolean valid = true;
        if (valid) {
            this.idDePersona = id;
        }
    }

    public Person () {

    }

    //Getter (método para obtener el valor de name)
    public String getName () {
        System.out.println("Regresando el valor de name");
        return this.name;
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

    public Double getSalarioMinimoMensual () {
        System.out.println("Regresar fuera del objeto el valor de Salario Minimo Mensual");
        return this.salarioMinimoMensual;
    }

    public void setSalarioMinimoMensual (Double salarioMinimoMensual) {
        System.out.println("Establecer desde fuera del objeto el valor de Salario Minimo Mensual");
        this.salarioMinimoMensual = salarioMinimoMensual;
    }

    @Override
    public void interfazPrueba() {

    }

    @Override
    public void segundoMetodo() {

    }

    @Override
    public void tercero() {

    }
}
