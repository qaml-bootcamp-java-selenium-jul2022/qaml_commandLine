package Circulo;

public class Circulo {
    private Double radio =1.0;

    public Circulo(){ }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getArea(){
        return ((radio*radio)*Math.PI);
    }

    public Double getCircunferencia(){
        return (2*Math.PI*radio);
    }

    @Override
    public String toString(){
        return "Mi Area es "+getArea()+" y mi Circunferencia es "+getCircunferencia();
    }
}
