package TareaVideojuego;

public class Enano extends Personaje{
    public Double altura=1.00;

    public Enano () {
        System.out.println("Se crea de personaje Enano");
    }

    @Override
    public void Atacar() {
        System.out.println("Enano ataca");
    }

    @Override
    public void Desplazarse() {
        System.out.println("Enano se desplaza hacia adelante");
    }

    @Override
    public void Arquero() {
        System.out.println("Enano se convierte en Arquero al subir 8 niveles");
    }

    @Override
    public void Guerrero() {
        System.out.println("Enano siempre es Guerrero");
    }

    @Override
    public void Mago() {
        System.out.println("Enano se convierte en mago despues de nivel 20");
    }

}
