package TareaZoologico;

public abstract class AnimalTerrestre extends Animal{
    protected Integer numeroPatas;
    protected Boolean esCarnivoro;

    public abstract void setEsCarnivoro();
    public abstract void setNumeroPatas();


    public Integer getNumeroPatas() {
        return numeroPatas;
    }

    public Boolean getEsCarnivoro() {
        return esCarnivoro;
    }
}