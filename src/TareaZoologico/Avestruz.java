package TareaZoologico;

public class Avestruz extends Aviario{
    String nombreAvestrus1;
    String nombreAvestrus2;

    Avestruz(String cadena1, String cadena2){
        this.nombreAvestrus1=cadena1;
        this.nombreAvestrus2=cadena2;
    }

    @Override
    public void sonidoAnimal() {
        System.out.println("El Pavo Real hace siseo como sonido");
    }

    @Override
    public void setTipoDeAnimal() {
        tipoDeAnimal="Avestruz, es un Ave";
        System.out.println("Este animal es un "+tipoDeAnimal);
    }

    @Override
    public String toString(){
        return  "Avestrus: "+this.nombreAvestrus1+", "+this.nombreAvestrus2;
    }

    @Override
    public boolean equals(Object obj) {
        return this.nombreAvestrus1.equals(obj);
    }
}
