package Zoologico;

public abstract class Acuario extends Animal {

    private Integer cantidadAletas;
    private String profundidadMaxima;

    public String getProfundidadMaxima() {
        System.out.println("Este animal se puede sumergir hasta: " + this.profundidadMaxima);
        return this.profundidadMaxima;
    }

    public void setProfundidadMaxima(String profundidadMaxima) {
        this.profundidadMaxima = profundidadMaxima;
    }



    public Integer getCantidadAletas() {
        System.out.println("Numero de Aletas: " + this.cantidadAletas);
        return this.cantidadAletas;
    }

    public void setCantidadAletas(Integer cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

}
