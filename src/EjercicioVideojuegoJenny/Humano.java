package EjercicioVideojuegoJenny;

public class Humano extends Personaje {
    @Override
    public void Arquero() {
        System.out.println("El Humano se convierte en arquero despues de 2 batallas.");
    }

    @Override
    public void Guerrero() {
        System.out.println("El Humano siempre es Guerrero.");
    }

    @Override
    public void Mago() {
        System.out.println("El Humano se convierte en mago despues de aprender los hechizos de Harry Potter.");
    }
}
