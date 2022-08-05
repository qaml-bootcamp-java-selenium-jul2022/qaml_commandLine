package Zoologico;

public abstract class Aviario extends Animal{
    private Double longitudAlas;
    private Double longitudCola;
    private Boolean puedeVolar;

    public Double getLongitudAlas() {
        return longitudAlas;
    }

    public void setLongitudAlas(Double longitudAlas) {
        this.longitudAlas = longitudAlas;
    }

    public Double getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(Double longitudCola) {
        this.longitudCola = longitudCola;
    }

    public Boolean getPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(Boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }
}
