package TareaVideojuego;

public class MainVideojuego {
    public static void main(String[] args) {
        //EJERCICIOS DE VIDEOJUEGOS
        System.out.println("\n-----------------EJERCICIO DE VIDEOJUEGOS-------------------");
        Enano enano1 = new Enano();
        enano1.name="Grimy";
        //enano1.setGuerrero();
        enano1.Guerrero();

        Elfo elfo1 = new Elfo();
        elfo1.name = "Legolas";
        //elfo1.setArquero();
        elfo1.Meditar();
        elfo1.Mago();
        elfo1.Arquero();

        Humano humano1 = new Humano();
        humano1.name = "Aragorn";
        //humano1.setMago();
        humano1.Desplazarse();
        humano1.Guerrero();
        humano1.Arquero();
    }
}
