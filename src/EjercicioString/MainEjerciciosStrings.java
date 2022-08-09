package EjercicioString;

public class MainEjerciciosStrings {
    public static void main(String[] args) {
        char [] arregloDeChars = new char [] {'H', 'o','l','a'};

        String str1 = new String(arregloDeChars);
        String str2 = new String("Hola");


        boolean objetosIguales = str1.equals(str2);
        System.out.println(objetosIguales);

        String str3 = "Hola";
        String str4 = "Hola";

        boolean cadenasIguales = str3.equals(str4);
        System.out.println(cadenasIguales);

        System.out.println("Hola".equals("Hola"));

        String resultadoEsperado = "Ejercicio 1 Strings";
        String resultadoActual = "Ejercicio 2 Strings";

        System.out.println(resultadoEsperado.equals(resultadoActual));
        System.out.println(resultadoEsperado.compareTo(resultadoActual) != 0
                                    ? "Las cadenas son diferentes"
                                    : "Las cadenas son iguales");

    }

    char caracterEnDeterminadoIndiceDeLaCadena (int indice, String cadena) {
        //Paso 1: //Validar que el indice se encuentre dentro del tamaño de la cadena
        char caracterEnIndice = ' ';
        if (indice < cadena.length()) {

        }
        return caracterEnIndice;
    }

}


