package Zoologico;

public abstract class Aviario extends Animal {
    private String colorAlas;
    private Boolean habilidadVuelo;

    public String getColorDeAlas() {
        System.out.println("El color de sus alas es: " + this.colorAlas);
        return this.colorAlas;
    }

    public void setColorDeAlas(String colorDeAlas) {
        this.colorAlas = colorDeAlas;
    }

    public Boolean getPosibilidadDeVuelo() {
        System.out.println("El ave es capaz de volar?: " + this.habilidadVuelo);
        return this.habilidadVuelo;
    }

    public void setPosibilidadDeVuelo(Boolean posibilidadDeVuelo) {
        this.habilidadVuelo = posibilidadDeVuelo;
    }
}
