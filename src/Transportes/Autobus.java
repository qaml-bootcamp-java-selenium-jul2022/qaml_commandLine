package Transportes;

public class Autobus extends TransporteTerrestre {
    public String Nombre = "Nombre";

    @Override
    public void Acelerar() {
        //El autobus utiliza un pedal
        System.out.println("El autobus acelera usando un pedal");
    }

    @Override
    public void usarTrasmision() {
        System.out.println("El autobus utiliza trasmision manual");
    }
}
