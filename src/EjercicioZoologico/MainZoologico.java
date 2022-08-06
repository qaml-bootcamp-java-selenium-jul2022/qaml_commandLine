package EjercicioZoologico;

public class MainZoologico {

    public static void main(String[] args) {
        //EJERCICIOS DE ZOOLOGICO
        System.out.println("\n-----------------EJERCICIO DE ZOOLOGICO-------------------");
        Leon Leoncio = new Leon();
        Leoncio.setNombre("El Leon se llama Leoncio");
        System.out.println(Leoncio.getNombre());
        Leoncio.setSexo("Masculino");
        Leoncio.getEdad(5);
        Leoncio.setTipoDeAnimal();
        Leoncio.setNumeroPatas();
        Leoncio.setEsCarnivoro();
        Leoncio.sonidoAnimal();
        Leoncio.Atacar();

        Delfin Delfy = new Delfin();
        Delfy.setNombre("El Delfin se llama Delfy");
        System.out.println(Delfy.getNombre());
        Delfy.setSexo("Femenino");
        Delfy.setTipoDeAnimal();
        Delfy.setNumeroAletas();
        Delfy.setProfundidad(105.5);
        Delfy.setTiempoAguantaRespiracion(30);
        Delfy.sonidoAnimal();
        Delfy.nadarProfundidad();

        PavoReal Rey = new PavoReal();
        Rey.setNombre("El Pavo Real se llama Rey");
        System.out.println(Rey.getNombre());
        Rey.setTipoDeAnimal();
        Rey.setLongitudAlas(0.5);
        Rey.setLongitudCola(1.5);
        System.out.println("El pavo real tiene alas de "+Rey.getLongitudAlas()+" metros, y cola de "+
                Rey.getLongitudCola()+" metros");
        Rey.sonidoAnimal();
        Rey.mostarSuCola();

        SerpienteDeCascabel Python = new SerpienteDeCascabel();
        Python.setNombre("La serpiente de Cascabel se llama Python");
        System.out.println(Python.getNombre());
        Python.setTipoDeAnimal();
        System.out.println("La Serpiente tiene "+Python.getNumeroPatas()+" patas");
        Python.setLargo(7.3);
        System.out.println("La Serpiente es "+Python.getLargo()+" metros de larga");
        Python.Arrastrarse();
        Python.mudaDePiel();

    }
}
