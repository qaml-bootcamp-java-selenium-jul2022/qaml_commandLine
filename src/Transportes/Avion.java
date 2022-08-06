package Transportes;

public class Avion extends TransporteAereo {
    Maletero maletero;

    public Avion(Integer altura) {
        super(altura);
        maletero = new Maletero();
    }

    @Override
    public void Acelerar() {
        //El avion usa una palanca
    }

    @Override
    public void volar() {

    }
}
