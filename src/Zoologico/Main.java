package Zoologico;

public abstract class Main {
    public static void main(String [] args) {

Delfin delfin = new Delfin();
Acuario acuario = new Acuario() {
    @Override
    public String getCasa() {
        return super.getCasa();
    }
};

Serpiente serpiente = new Serpiente();
Reptiliario reptiliario = new Reptiliario() {
    @Override
    public String getCasa() {
        return super.getCasa();
    }
};

Pavoreal pavoreal = new Pavoreal();
Aviario aviario = new Aviario() {
    @Override
    public String getCasa() {
        return super.getCasa();
    }
};

Leon leon = new Leon();
Terrestre terrestre = new Terrestre() {
    @Override
    public String getCasa() {
        return super.getCasa();
    }
};

delfin.setName("Flipper");
delfin.setPeso("50kg");
delfin.setEdad("40 años");

serpiente.setName("Agatha");
serpiente.setPeso("15.5Kg");
serpiente.setEdad("18 años");

pavoreal.setName("Gollo");
pavoreal.setEdad("11 años");
pavoreal.setPeso("11 Kilos");

leon.setName("Toño");
leon.setEdad("70 años");
leon.setPeso(50.20);

System.out.println(acuario.getCasa());
System.out.println("Este es el nombre del delfin " + delfin.getName());
System.out.println("Este es el peso del delfin " + delfin.getPeso());
System.out.println("Esta es la edad del delfin " + delfin.getEdad());

System.out.println(reptiliario.getCasa());
System.out.println("Este es el nombre de la serpiente " + serpiente.getName());
System.out.println("Este es el peso de la serpiente " + serpiente.getPeso());
System.out.println("Esta es la edad de la serpiente " + serpiente.getEdad());

System.out.println(aviario.getCasa());
System.out.println("Este es el nombre del pavoreal " + pavoreal.getName());
System.out.println("Este es el peso del pavoreal " + pavoreal.getPeso());
System.out.println("Esta es la edad del pavoreal " + pavoreal.getEdad());

System.out.println(terrestre.getCasa());
System.out.println("Este es el nombre del leon " + leon.getName());
System.out.println("Este es el peso del leon " + leon.getPeso());
System.out.println("Esta es la edad del leon " + leon.getEdad());
    }

}
