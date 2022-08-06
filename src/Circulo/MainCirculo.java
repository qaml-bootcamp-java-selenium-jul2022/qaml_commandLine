package Circulo;

public class MainCirculo {
    public static void main(String[] args) {

        //EJERCICIOS DE CIRCULO
        System.out.println("\n-----------------EJERCICIO DE CIRCULO-------------------");
        Circulo Circulo1 = new Circulo(2.5);
        System.out.println("El valor del radio es "+Circulo1.getRadio());
        System.out.println("El Area del Circulo es "+Circulo1.getArea());
        System.out.println("La Circunferencia del Circulo es "+Circulo1.getCircunferencia());
        Circulo1.toString();

    }
}
