package zoologico;

class Avestruz extends HabitatTerrestre {

    private String nombre = "Sin nombre";
    private String origen = "Sin origen";

    public Avestruz(String nombre, String origen) {
        this.nombre = nombre;
        this.origen = origen;

    }

    @Override
    public String toString() {

        return "Haz instanciado a un Aveztruz " + "\nSu nombre es: " + this.nombre + "\nY es de origen :" + this.origen;
    }

    @Override
    public boolean equals (Object obj) {
        Avestruz a = (Avestruz) obj;
        boolean res = (nombre == a.nombre) && (origen == a.origen);
        if (res == true){
            System.out.println("Las propiedades del aveztruz son iguales");
        }
        else
            System.out.println("Las propiedades del aveztruz  NO son iguales");

        return res;
    }
}
