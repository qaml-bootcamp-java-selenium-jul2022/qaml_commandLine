package Zoologico;

public abstract class AnimalTerrestre extends Animal {
    private Integer cantidadExtremidades = 0;

    public void setCantidadExtremidades(Integer nuevoCantidadExtremidades){
        this.cantidadExtremidades = nuevoCantidadExtremidades;
    }
    public Integer getCantidadExtremidades(){
        System.out.println("Numero de Extremidades: " + this.cantidadExtremidades);
        return this.cantidadExtremidades;
    }
}
