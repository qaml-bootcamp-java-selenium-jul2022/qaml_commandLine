package Zoologico;

public class PavoReal extends Aviario{
    @Override
    public void sonidoAnimal() {
        System.out.println("El Pavo Real hace gluglutear como sonido");
    }

    @Override
    public void setTipoDeAnimal() {
        tipoDeAnimal="Pavo Real, es un Ave";
        System.out.println("Este animal es un "+tipoDeAnimal);
    }

    public void mostarSuCola(){
        System.out.println("El Pavo Real expande su cola para atraer a su pareja");
    }
}