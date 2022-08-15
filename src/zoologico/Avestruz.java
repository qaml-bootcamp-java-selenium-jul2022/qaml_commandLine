package zoologico;

public class Avestruz {
    String cadena1 ;
    String cadena2 ;

    public Avestruz(String cadena1, String cadena2){
            this.cadena1 = cadena1;
            this.cadena2 = cadena2;
    }

    @Override
    public String toString(){
        return "Avestruz: " + this.cadena1 +" "+ this.cadena2;
    }

    @Override
    public boolean equals(Object obj) {
        return this.cadena1.equals(obj);
    }
}
