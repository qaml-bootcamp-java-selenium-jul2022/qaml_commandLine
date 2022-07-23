package Transportes;

public abstract class MediosDeTransporte {
    //Nombre, velocidad, kilometraje, tipo de transporte, capacidad de carga
    private String nombre;
    private Integer velocidad;
    private Integer kilometraje;
    private Integer capacidadDeCarga;

    abstract void Acelerar();

    abstract void Volar();
}
