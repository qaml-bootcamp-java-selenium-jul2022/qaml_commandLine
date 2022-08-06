package calculocirculo;

public class Circulo {

private double radio;


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    //double PI = Math.PI;

   public Circulo(double radio){
        this.radio = radio;
        double res;
        res = Math.PI * (radio*radio);
   }


   public double getCircunfencia(){
        double res;
        res = (radio*2)/Math.PI;
        return res;
   }

   public double getArea(){
        double res;
        res = Math.PI * (radio*radio);
       return res;
   }

   @Override
    public String toString(){
      return "El area del circulo es:¨" +String.valueOf(getArea());
   }

}
