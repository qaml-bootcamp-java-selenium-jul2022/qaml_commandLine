package Zoologico;

public class Delfin extends Acuario{

    @Override
    public void sonidoAnimal() {
        System.out.println("Delfin hace un chillido como sonido");
    }

    @Override
    public void setTipoDeAnimal() {
        tipoDeAnimal="Delfin, es un Animal Acuatico";
        System.out.println("Este animal es un "+tipoDeAnimal);
    }

    public void nadarProfundidad(){
        System.out.println("El Delfin anda a la maxima profundidad de "+getProfundidad()+
                " metros y aguanta la respiracion por "+getTiempoAguantaRespiracion()+" minutos");
    }

    @Override
    public void setNumeroAletas() {
        numeroAletas=3;
        System.out.println("El Delfin tiene "+numeroAletas+" aletas");
    }
}