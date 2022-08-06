package Videojuego;

public class Humano extends Personaje{
    public Double altura=1.70;

    public Humano () {
        System.out.println("Se crea de personaje Humano");
    }

    public void Aprender(){
        System.out.println("Elfo se dedica a aprender");
    }

    @Override
    public void Desplazarse() {
        System.out.println("Humano se desplaza hacia adelante");
    }

    @Override
    public void Atacar() {
        System.out.println("Humano ataca");
    }

    @Override
    public void Arquero() {
        System.out.println("Humano se convierte en Arquero al subir 5 niveles");
    }

    @Override
    public void Guerrero() {
        System.out.println("Humano se convierte en Guerrero al subir su primer nivel");
    }

    @Override
    public void Mago() {
        System.out.println("Humano se convierte en Mago despues de 10 niveles");
    }
}
