package EjercicioReplace;

public class Main {

    public static void main(String[] args) {

        Main rpl = new Main();
        rpl.replaceCadena();
        rpl.startsWith();
        rpl.endsWith();
        String strCadena = "Hola Mundo Ejercicio tres";
        rpl.startsWith(strCadena);
    }
    public void replaceCadena() {

        String strCadena = "Hola Mundo Ejercicio tres";
        String strCadena2 = strCadena.replace('H', 'S');
        String strCadena3 = strCadena.replace("Mundo", "Tierra");
        String strCadena4 = strCadena.replace('e', 'x');
        System.out.println(strCadena2);
        System.out.println(strCadena3);
        System.out.println(strCadena4);
    }

    public void startsWith() {

        String strCadena = "Hola Mundo Ejercicio tres";
        Boolean comparacion = strCadena.startsWith("Hola");
        System.out.println(comparacion);
        System.out.println(strCadena.startsWith("Hola") ==true ? "Cadena es verdadera":"Cadena no es igual");

    }

    public void startsWith(String strCadena) {

        Boolean comparacion = strCadena.startsWith("Holi");
        System.out.println(comparacion);
        System.out.println(strCadena.startsWith("Holi") ==true ? "Cadena es verdadera":"Cadena no es igual");

    }

    public void endsWith() {

        String strCadena = "Hola Mundo Ejercicio tres";
        Boolean comparacion = strCadena.endsWith("tres");
        System.out.println(comparacion);
        System.out.println(strCadena.endsWith("tres") ==true ? "Cadena es verdadera":"Cadena no es igual");
    }

}


