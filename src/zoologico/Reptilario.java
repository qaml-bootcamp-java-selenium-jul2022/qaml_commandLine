package Zoologico;

public abstract class Reptilario extends Animal{
    private Integer numeroPatas=0;
    private Double largo;

    public Integer getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(Integer numeroPatas) {
        this.numeroPatas = numeroPatas;
        System.out.println("tiene "+numeroPatas+" patas");
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }
}