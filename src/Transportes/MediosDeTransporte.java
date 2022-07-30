package Transportes;

public abstract class MediosDeTransporte {
    //Nombre, velocidad, kilometraje, tipo de transporte, capacidad de carga
    private String nombre;
    public Integer velocidad;
    public Integer kilometraje;
    private Integer capacidadDeCarga;

    public abstract void Acelerar();
}
