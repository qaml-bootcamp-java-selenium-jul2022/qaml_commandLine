package EjercicioVideojuego;

public class Elfo extends Personaje {
    private String nombreElfo = "Sin nombre";

    //Constructor es de adorno
    public Elfo () {

    }

    public Elfo (String nombreElfo) {
        this.nombreElfo = nombreElfo;
    }

    @Override
    public void Arquero() {
        System.out.println("El Elfo se convierte en arquero despues de 1 batalla.");
    }

    @Override
    public void Guerrero() {
        System.out.println("El Elfo se convierte en Guerrero despues de 5 peleas contra enanos.");
    }

    @Override
    public void Mago() {
        System.out.println("El Elfo se convierte en Mago despues de soñar con Harry Potter.");
    }

    //Sobreescribiendo toString() en el objeto/clase Elfo
    @Override
    public String toString () {
        return "El nombre del Elfo es: " + this.nombreElfo;
    }

    //Sobreescribiendo equals() en el objeto/clase Elfo
    @Override
    public boolean equals (Object obj) {
        return this.nombreElfo.equals(obj);
    }
}
