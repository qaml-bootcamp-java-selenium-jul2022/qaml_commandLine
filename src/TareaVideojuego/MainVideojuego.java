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

        //EJERCICIOS DE VIDEOJUEGOS
        System.out.println("\n-----------------EJERCICIO DE VIDEOJUEGOS -  ToString and Equals-------------------");
        Elfo elfoTutora = new Elfo("Jenny");
        System.out.println(elfoTutora.toString());

        System.out.println(elfoTutora.equals("Alex"));


        //EJERCICIOS de Diagramas de flujo
        System.out.println("\n-----------------EJERCICIO DE Diagrama de Flujo -  if and Switch-------------------");
        Personaje creandoPersonaje = createPersonaje(Personajes.ELFO);
        Personaje personajeConSwitch = crearPersonajeConSwitch(Personajes.ELFO);

    }

    static Personaje createPersonaje (Personajes personaje){
        if (personaje.equals(Personajes.HUMANO)){
            System.out.println("Retornando objeto Humano");
            return new Humano();
        }else if (personaje.equals(Personajes.ELFO)){
            System.out.println("Retornando objeto Elfo");
            return new Elfo();
        }else {
            System.out.println("Retornando objeto Enano");
            return new Enano();
        }

        static Personaje crearPersonajeConSwitch(Personajes personaje1){
            switch (personaje1){
                case ELFO :
                    System.out.println("Retornando objeto Elfo");
                    new Elfo(); //break; //en caso de no usar un return, usar break para cada case
                case ENANO:
                    System.out.println("Retornando objeto Elfo");
                    return new Enano(); //break;
                default:
                    System.out.println("Retornando objeto Humano");
                    return new Humano();
            }
        }

    }
}


