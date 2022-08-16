package Zoologico;

public class AnimalesTerrestres extends Animal {

    public void escalar() {
        System.out.println("El león puede escalar árboles para cazar a sus presas");

    }

    @Override
    public void comer() {
        System.out.println("El animal terrestre puede ser carnivoro o herbívoro");
    }

    @Override
    public void dormir() {
        System.out.println("Algunos animales terrestres suelen dormir largas horas en el día");
    }

    @Override
    public String toString() {
        return "";
    }
    @Override
    public String equals() {
        return "";
    }
}