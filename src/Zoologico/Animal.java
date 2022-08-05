package Zoologico;

public abstract class Animal {

    public String nombre;
    public Double peso;
    public Integer edad;
    public String genero;
    public String tamanio;
    public String color;

    public abstract void comer();
    public abstract void dormir();

}