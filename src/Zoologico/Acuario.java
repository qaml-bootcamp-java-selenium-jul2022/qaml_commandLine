package Zoologico;

public class Acuario extends Animal {

    public void nadar() {
        System.out.println("Los animales marinos son excelentes nadadores");
    }

    @Override
    public void comer() {
        System.out.println("Muchos animales marinos se alimentan de otros peces o de plancton");
    }

    @Override
    public void dormir() {
        System.out.println("Los animales marinos son muy variables sus horas de suenio");
    }
}