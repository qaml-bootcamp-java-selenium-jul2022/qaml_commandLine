package Zoologico;

public class Delfin extends Acuario{
String name = "Delfin Default";
String peso = "1kg";
String edad = "1 año";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
