package zoologico;

public class Avestruz extends HabitatTerrestre {
    private String nombre = "Mi nombre";
    private String color = "Mi color";

    public Avestruz(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Soy una nueva Aveztruz y mi nombre es:" + this.nombre + " y soy de color: " + this.color;
    }

    @Override
    public  boolean equals (Object objeto){
        Avestruz miAveztruz = (Avestruz) objeto;
        boolean comparacion = (nombre == miAveztruz.nombre && color == miAveztruz.color);
        if(comparacion){
            System.out.println("Las caracteristicas del mi Avestruz Son iguales");
        } else {
            System.out.println("Las caracteristicas de mi Aveztruz no Son iguales");
        }
        return comparacion;
    }
}
