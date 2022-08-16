package Zoologico;

public class Aviario extends Animal {

    public Aviario (String nombre) {
        this.nombre = nombre;
    }


    public void volar() {
        System.out.println("Algunos animales de aviario no pueden volar");

    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {}

    @Override
    public String toString() {
        return "Este animal se llama: " + nombre;
    }

    @Override
    public String equals() {
            return "Las propiedades recibidas del Avestruz son iguales: " + (this.nombre.equals("avestruz") ) ;
    }
}