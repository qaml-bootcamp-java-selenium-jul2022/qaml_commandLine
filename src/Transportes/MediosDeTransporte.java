package Transportes;

public abstract class MediosDeTransporte {
    private String name;
    public Integer velocidad;
    public Integer Kilometraje;
    private Integer capacidadDeCarga;
    //private String tipoDeTransporte;

    abstract void Acelerar();
}
