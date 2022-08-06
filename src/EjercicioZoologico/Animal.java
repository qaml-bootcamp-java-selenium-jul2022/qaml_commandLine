package EjercicioZoologico;

public abstract class Animal {
    private String nombre;
    protected String tipoDeAnimal;
    private String sexo;
    private Integer edad;
    private Double peso;


    public abstract void sonidoAnimal();
    public abstract void setTipoDeAnimal();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad(int i) {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

}