package EjerciciosString;

public class MainEjerciciosStrings {

    public static void main(String[] args) {
        char [] arregloDeChars = new char[] {'H','o','l','a'};

        String str1 = new String(arregloDeChars);
        String str2 = new String("Hola");

        boolean objetosIguales = str1.equals(str2);
        System.out.println(objetosIguales);

        String str3 = "Hola";
        String str4 = "Hola";

        boolean cadenasIguales = str3.equals(str4);
        System.out.println(cadenasIguales);

        System.out.println("Hola".equals("Hola"));

        String resultadoEsperado = "Ejercicio 1 Strings"; //Diferencia aqui son numeros positivos
        String resultadoActual = "Ejercicio 11 Strings"; //Diferencia es aqui numeros negativos

        System.out.println(resultadoEsperado.equals(resultadoActual));
        System.out.println(
                resultadoEsperado.compareTo(resultadoActual) != 0
                        ? "Las cadenas son diferentes"
                        : "Las cadenas son iguales");


        System.out.println(
                "Caso negativo" + caracterEnDeterminadoIndiceDeLaCadena(50, resultadoActual)
        );

        System.out.println(
                "Caso negativo:"
                        + caracterEnDeterminadoIndiceDeLaCadena(50, resultadoActual, '*')
        );

        System.out.println(
                "Caso positivo:"
                        + caracterEnDeterminadoIndiceDeLaCadena(9, resultadoActual, '*')
        );

        System.out.println("Caso positivo:"+
                posicionDeDeterminadoCaracter('e',resultadoEsperado));//E->0,e->2,a->-1
        System.out.println("caso negativo:"+
                posicionDeDeterminadoCaracter('a',resultadoEsperado));//E->0,e->2,a->-1

        System.out.println("caso negativo:"+
                caracterEnDeterminadoIndiceDeLaCadena(50, resultadoActual,'*')
        );

        System.out.println("Caso positivo:"+
                caracterEnDeterminadoIndiceDeLaCadena(9, resultadoActual,'*')
        );
    }

    static char caracterEnDeterminadoIndiceDeLaCadena (int indice, String cadena) {
        //Paso 1: Validar que el índice se encuentre dentro del tamaño de la cadena
        char caracterEnIndice = '"';
        if (indice < cadena.length()) {
            //Paso 2: Asignar a la variable que retornamos el valor de charAt(indice)
            caracterEnIndice = cadena.charAt(indice);
        }
        return  caracterEnIndice;
    }


    static int posicionDeDeterminadoCaracter (char caracter, String cadena){
        int posicion =-1;
        posicion=cadena.indexOf(caracter);
        return posicion;
    }

    static char caracterEnDeterminadoIndiceDeLaCadena (int indice, String cadena, char caracterReemplazoDeVacios) {
        //Paso 1: Validar que el índice se encuentre dentro del tamaño de la cadena
        char caracterEnIndice = ' ';
        cadena = cadena.replace(' ', caracterReemplazoDeVacios);
        //System.out.println(cadena);
        if (indice < cadena.length()) {
            //Paso 2: Asignar a la variable que retornamos el valor de charAt(indice)
            caracterEnIndice = cadena.charAt(indice);
        }
        return  caracterEnIndice;
    }

}
