package TareaVideojuego;

public class Elfo extends Personaje{
    public Double altura=2.00;

    public Elfo () {
        System.out.println("Se crea de personaje Elfo");
    }

    public void Meditar(){
        System.out.println("Elfo se dedica a meditar");
    }

    @Override
    public void Desplazarse() {
        System.out.println("Elfo se desplaza hacia adelante");
    }

    @Override
    public void Atacar() {
        System.out.println("Elfo ataca");
    }
    //public abstract void CanalizarEnergia();

    @Override
    public void Arquero() {
        System.out.println("Elfo se convierte en Arquero al subir 2 niveles");
    }

    @Override
    public void Guerrero() {
        System.out.println("Elfo se convierte en Guerrero despues de 6 niveles");
    }

    @Override
    public void Mago() {
        System.out.println("Elfo siempre es Mago");
    }
}
