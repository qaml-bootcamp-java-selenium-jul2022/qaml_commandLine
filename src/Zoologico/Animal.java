package Zoologico;

public abstract class Animal {
    private String nombre;
    private Double peso;
    private String tipoAnimal;
    private String sexoDelAnimal;
    private String longitudAnimal;

    public String getLongitudAnimal() {
        System.out.println("Este animal mide: " + this.longitudAnimal);
        return this.longitudAnimal;
    }

    public void setLongitudAnimal(String longitudAnimal) {
        this.longitudAnimal = longitudAnimal;
    }



    public abstract void SonidoAnimal();
    public abstract void AccionDelAnimal();

    public String getNombre(){
        System.out.println("Nombre del animal: " + this.nombre);
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Double getPeso(){
        System.out.println("Peso del animal: " + this.peso);
        return  this.peso;
    }
    public void setPeso(Double peso){
        this.peso = peso;
    }

    public String getTipoAnimal() {
        System.out.println("Este animal es de tipo: " + this.tipoAnimal);
        return this.tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    public String getSexoDelAnimal(){
        System.out.println("Este animal es: " + this.sexoDelAnimal);
        return this.sexoDelAnimal;
    }
    public void setSexoDelAnimal(String sexoDelAnimal){
        this.sexoDelAnimal = sexoDelAnimal;
    }
}
