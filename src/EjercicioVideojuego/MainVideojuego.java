package EjercicioVideojuego;

public class MainVideojuego {
    public static void main (String args[]) {
        Elfo elfoTutora = new Elfo ("Jenny");
        System.out.println(elfoTutora.toString());

        System.out.println(elfoTutora.equals("Alex"));
    }
}
