package EjercicioZoologico;

public class Leon extends AnimalTerrestre{


    @Override
    public void sonidoAnimal() {
        System.out.println("El Leon ruge");
    }

    @Override
    public void setTipoDeAnimal() {
        tipoDeAnimal="Leon, es un Animal Terrestre";
        System.out.println("Este animal es un "+tipoDeAnimal);
    }

    public void Atacar(){
        System.out.println("El Leon ataca y debora a su presa");
    }

    @Override
    public void setEsCarnivoro() {
        esCarnivoro=true;
        System.out.println("El Leon es Carnivoro");
    }

    @Override
    public void setNumeroPatas() {
        numeroPatas=4;
        System.out.println("El Leon tiene "+numeroPatas+" patas");
    }
}