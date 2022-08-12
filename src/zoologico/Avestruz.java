package zoologico;

class Avestruz extends HabitatTerrestre{

    private String nombre = "Sin nombre";
    private String origen = "Sin origen";
    public Avestruz(String nombre, String origen)
    {
        this.nombre = nombre;
        this.origen = origen;

    }

    @Override
    public String toString() {

        return "Haz instanciado a un Aveztruz " + "\nSu nombre es: " + this.nombre + "\nY es de origen :" + this.origen;
    }

    public boolean equals (String nombre, String origen) {

        ((nombre.compareTo(nombre)) && (origen.compareTo(origen))) != 0
                ? "Las cadenas son diferentes" //Si es true
                : "Las cadenas son iguales"); //Si es false



    return
            this.nombre.equals(nombre);


    }
}
