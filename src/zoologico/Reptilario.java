package Zoologico;

public abstract class Reptilario extends Animal{

    private String tiempoMudaPiel;

    public String getTiempoMudaPiel() {
        System.out.println("Este animal muda de piel cada: " + this.tiempoMudaPiel);
        return this.tiempoMudaPiel;
    }

    public void setTiempoMudaPiel(String tiempoMudaPiel) {
        this.tiempoMudaPiel = tiempoMudaPiel;
    }



}
