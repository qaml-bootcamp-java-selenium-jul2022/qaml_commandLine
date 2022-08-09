package Transportes;

public abstract class TransporteAereo extends MediosDeTransporte{
    public Integer altura;
    public String TipoHelices;
    private int alturaMaxima;

    public abstract void volar();

    /*public TransporteAereo () {
        this.alturaMaxima = 3000;
    }*/

    public TransporteAereo (Integer altura) {
        this.altura = altura;
    }
}
