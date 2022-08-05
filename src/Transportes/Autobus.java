package Transportes;

public class Autobus extends TransporteTerrestre{
    public  String Nombre = "Autobus";

    @Override
    public void Acelerar() {
        System.out.println("El Autobus acelera usando un pedal");
    }

    @Override
    public void frenadoDeMano() {
        System.out.println("El Autobus frena usando un pedal");
    }

    @Override
    public void usarTransmisionManual() {
        System.out.println("El Autobus acelera usando transmision manual");
    }
}
