package EjercicioZoologico;

public class SerpienteDeCascabel extends Reptilario{

    @Override
    public void sonidoAnimal() {
        System.out.println("La Serpiente de cascabel sisea");
    }
    @Override
    public void setTipoDeAnimal() {
        tipoDeAnimal="Serpiente de cascabel, es un Reptil";
        System.out.println("Este animal es una "+tipoDeAnimal);
    }

    public void Arrastrarse(){
        System.out.println("La Serpiente se arrastra para avanzar hacia adelante");
    }

    public void mudaDePiel(){
        System.out.println("La Serpiente muda de piel");
    }
}