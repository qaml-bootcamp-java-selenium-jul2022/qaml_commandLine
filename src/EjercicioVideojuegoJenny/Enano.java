package EjercicioVideojuegoJenny;

public class Enano extends Personaje {
    @Override
    public void Arquero() {
        System.out.println("El Enano se convierte en arquero despues de 5 batallas.");
    }

    @Override
    public void Guerrero() {
        System.out.println("El Enano se convierte en arquero despues de 1 batalla.");
    }

    @Override
    public void Mago() {
        System.out.println("El Enano se convierte en arquero despues de acompañar al humano en 10 batallas.");
    }
}
