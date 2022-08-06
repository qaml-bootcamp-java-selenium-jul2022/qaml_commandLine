package EjerciciosString;

public class Main {
    public static void main(String[] args) {

        char [] arregloDeChars = new char[]{'H','o','l','a'};


        String str1 = new String(arregloDeChars);
        String str2 = new String("Hola");


        boolean objetosIguales = str1.equals(str2);
        System.out.println(objetosIguales);

        String str3 = "Hola";
        String str4 = "Hola";

        boolean cadenasIguales = str3.equals(str4);
        System.out.println(cadenasIguales);

        System.out.println("Hola".equals("Hola"));

        String resultadoEsperado = "Ejercicio 1 String";
        String resultadoActual = "Ejercicio 11 String";

        System.out.println(resultadoEsperado.equals(resultadoActual));

        System.out.println(
                resultadoEsperado.compareTo(resultadoActual) != 0
                ? "Las cadenas son diferentes"
                : "Las cadenas son iguales");

        System.out.println(caracterEnDeterminadoIndiceDeLaCadena(1,resultadoActual));

        System.out.println(indiceDeDeterminadoCaracter(resultadoActual,'e'));


    }
    static char caracterEnDeterminadoIndiceDeLaCadena(int indice, String cadena){
        //Paso1: validar que el indice se encuentre dentro del tamaño de la cadena
        char caracterEnIndice = '"';
        if (indice<cadena.length()){
            //Paso 2: Asignar a la variable que retornamos el valor de charAt()
            caracterEnIndice = cadena.charAt(indice);
        }
        return caracterEnIndice;
    }

    static int indiceDeDeterminadoCaracter(String cadena, char caracter){
        int IndiceDeCaracter = 0;
            IndiceDeCaracter = cadena.indexOf(caracter);
        return IndiceDeCaracter;
    }
}
