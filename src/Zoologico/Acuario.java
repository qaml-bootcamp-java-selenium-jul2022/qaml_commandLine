package Zoologico;

public abstract class Acuario extends Animal{
    protected Integer numeroAletas;
    private Integer tiempoAguantaRespiracion;
    private Double profundidad;


    public abstract void setNumeroAletas();


    public Integer getNumeroAletas() {
        return numeroAletas;
    }

    public Integer getTiempoAguantaRespiracion() {
        return tiempoAguantaRespiracion;
    }

    public void setTiempoAguantaRespiracion(Integer tiempoAguantaRespiracion) {
        this.tiempoAguantaRespiracion = tiempoAguantaRespiracion;
    }

    public Double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Double profundidad) {
        this.profundidad = profundidad;
    }
}
