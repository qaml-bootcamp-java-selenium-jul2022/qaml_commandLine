package EjercicioVideojuego;

public class Main {
    public static void main (String [] args){
        Elfo elfoAlvaro = new Elfo("Alvaro");
        System.out.println(elfoAlvaro.toString());

        System.out.println(elfoAlvaro.equals("Miguel"));

        Personaje creandoPersonaje = crearPersonaje(Personajes.ELFO);

        Personaje crearPersonajeConSwitch = crearPersonajeConSwitch(Personajes.HUMANO);

    }

    static Personaje crearPersonaje(Personajes personaje){
        if(personaje.equals(Personajes.HUMANO)){
            System.out.println("Retornando objeto Humano");
            return new Humano();
        }else{
            if (personaje.equals(Personajes.ELFO)){
                System.out.println("Retornando objeto Elfo");
                return new Elfo();
            }else{
                System.out.println("Retornando objeto Enano");
                return new Enano();
            }
        }
    }

    static Personaje crearPersonajeConSwitch(Personajes personaje){
        switch(personaje){
            case ELFO:
                System.out.println("Retornando objeto Elfo");
                return new Elfo();
            case ENANO:
                System.out.println("Retornando objeto Enano");
                return new Enano();
            default:
                System.out.println("Retornando objeto Humano");
                return new Humano();

        }
    }
}
