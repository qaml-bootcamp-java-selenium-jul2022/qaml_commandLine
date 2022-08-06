package Transportes;

public abstract class TransporteTerrestre extends MediosDeTransporte{
    public String tipoDeGasolina;
    public Integer tamanoDeLlantas;
    private Integer Kilometraje;

    abstract void frenadoDeMano();

    abstract void usarTransmisionManual();
}
