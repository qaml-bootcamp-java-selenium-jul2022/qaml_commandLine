package Zoologico;

public class Leon extends AnimalTerrestre{

    @Override
    public void SonidoAnimal(){
        System.out.println("El León produce un rugido como sonido.");
    }

    @Override
    public void AccionDelAnimal() {
        System.out.println("El León puede cazar.");
    }

}
