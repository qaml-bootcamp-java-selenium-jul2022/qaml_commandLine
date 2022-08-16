package zoologico;

public class Avestruz extends Aviario {

    public String propiedadAvestruz1;
    public String propiedadAvestruz2;

    public Avestruz(){
        System.out.println("Has inicializado animal como Avestruz");
    }

    public  Avestruz(String propiedadAvestruz1, String propiedadAvestruz2){
        this.propiedadAvestruz1=propiedadAvestruz1;
        this.propiedadAvestruz2=propiedadAvestruz2;
        System.out.println("El Avestruz es inicializado como " +this.propiedadAvestruz1+" "+this.propiedadAvestruz2);
    }


    @Override
    public String toString(){
        return "Avestruz: " + this.propiedadAvestruz1 +" "+ this.propiedadAvestruz2;
    }

    @Override
    public boolean equals(Object obj) {
        return this.propiedadAvestruz1.equals(this.propiedadAvestruz2);
    }
}




