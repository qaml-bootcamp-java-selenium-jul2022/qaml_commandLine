package EjercicioVideojuegoJenny;

public class Elfo extends Personaje {
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
}
