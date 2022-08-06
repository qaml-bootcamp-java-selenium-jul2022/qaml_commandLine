package TareaVideojuego;


public abstract class Personaje {
    public String name;
    public String skin;
    public String tipoDeArma;
    public Double altura;
    public String ocupacion;

    public abstract void Desplazarse();
    public abstract void Atacar();

    public void setArquero(){
        System.out.println("Personaje tiene ocupacion de Arquero");
        ocupacion="Arquero";
    }

    public void setMago(){
        System.out.println("Personaje tiene ocupacion de Mago");
        ocupacion="Mago";
    }

    public void setGuerrero(){
        System.out.println("Personaje tiene ocupacion de Guerrero");
        ocupacion="Guerrero";
    }

    public abstract void Arquero();
    public abstract void Guerrero();
    public abstract void Mago();

}
