package zoologico;

public class Avestruz extends Aviario{
    String propiedadAvestrus1;
    String propiedadAvestrus2;

    Avestruz(String cadena1, String cadena2){
        this.propiedadAvestrus1=cadena1;
        this.propiedadAvestrus2=cadena2;
        System.out.println("Has inicializado animal como Pavorreal");
    }


    @Override
    public String toString(){
        return  "Avestrus: "+this.propiedadAvestrus1+", "+this.propiedadAvestrus2;
    }

    @Override
    public boolean equals(Object obj) {
        return this.propiedadAvestrus1.equals(obj);
    }
}
