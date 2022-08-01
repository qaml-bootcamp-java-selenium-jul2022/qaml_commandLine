package Zoologico;

public class Main {

    public static void main(String[] args) {
        Leon animal1 = new Leon();
        Pavorreal animal2 = new Pavorreal();
        Delfin animal3 = new Delfin();
        SerpienteCascabel animal4 = new SerpienteCascabel();

        animal1.setNombre("Alex el leon");
        animal1.getNombre();
        animal1.setTipoAnimal("Felino");
        animal1.getTipoAnimal();
        animal1.setSexoDelAnimal("Macho");
        animal1.getSexoDelAnimal();
        animal1.setCantidadExtremidades(4);
        animal1.getCantidadExtremidades();
        animal1.setPeso(300.00);
        animal1.getPeso();
        animal1.SonidoAnimal();
        animal1.AccionDelAnimal();

        System.out.println();

        animal2.setNombre("Pepe el pavo real");
        animal2.getNombre();
        animal2.setTipoAnimal("Ave");
        animal2.getTipoAnimal();
        animal2.setColorDeAlas("Tornasol");
        animal2.getColorDeAlas();
        animal2.setSexoDelAnimal("Macho");
        animal2.getSexoDelAnimal();
        animal2.setPeso(25.00);
        animal2.getPeso();
        animal2.SonidoAnimal();
        animal2.AccionDelAnimal();
        animal2.setPosibilidadDeVuelo(false);
        animal2.getPosibilidadDeVuelo();

        System.out.println();

        animal3.setNombre("Flipper la delfin");
        animal3.getNombre();
        animal3.setTipoAnimal("Acuatico");
        animal3.getTipoAnimal();
        animal3.setPeso(150.00);
        animal3.getPeso();
        animal3.setSexoDelAnimal("Hembra");
        animal3.getSexoDelAnimal();
        animal3.setCantidadAletas(4);
        animal3.getCantidadAletas();
        animal3.AccionDelAnimal();
        animal3.SonidoAnimal();
        animal3.setProfundidadMaxima("300 metros");
        animal3.getProfundidadMaxima();

        System.out.println();

        animal4.setNombre("Kaa la serpiente");
        animal4.getNombre();
        animal4.setLongitudAnimal("6 metros");
        animal4.getLongitudAnimal();
        animal4.setPeso(1.50);
        animal4.setTipoAnimal("Reptil");
        animal4.getTipoAnimal();
        animal4.setSexoDelAnimal("Hembra");
        animal4.getSexoDelAnimal();
        animal4.setLongitudAnimal("2 mts");
        animal4.getLongitudAnimal();
        animal4.setTiempoMudaPiel("1 año aproximadamente");
        animal4.getTiempoMudaPiel();
        animal4.SonidoAnimal();
        animal4.AccionDelAnimal();

    }
}
