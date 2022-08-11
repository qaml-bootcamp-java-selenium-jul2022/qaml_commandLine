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

        System.out.println(insertarCharsEnCadena("HELLO ---", 'A', 6));

        System.out.println(armarCaracter("Luis Gerardo", "Muñoz", "Ortega", "Mexico", 32));

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

    static char caracterEnDeterminadoIndiceDeLaCadena (int indice, String cadena, char caracterReemplazoDeVacios) {
        //Paso 1: Validar que el índice se encuentre dentro del tamaño de la cadena
        char caracterEnIndice = ' ';
        //cadena = cadena.replace(' ', caracterReemplazoDeVacios);
        if (indice < cadena.length()) {
            //Paso 2: Asignar a la variable que retornamos el valor de charAt(indice)
            caracterEnIndice = cadena.replace(' ', caracterReemplazoDeVacios).charAt(indice);
        }
        return  caracterEnIndice;

    }
    static String insertarCharsEnCadena (String cadena, char caracterAInsertar, int posicion) {
        StringBuilder constructordeCadena = new StringBuilder(cadena);
        constructordeCadena.insert(posicion, caracterAInsertar);
        return constructordeCadena.toString();
    }

    static String armarCaracter (String nombre, String apaterno, String amaterno, String nacionalidad, int edad) {
        StringBuilder armado = new StringBuilder();
        armado.append("Me llamo ");
        armado.append(nombre);
        armado.append(" ");
        armado.append(apaterno);
        armado.append(" ");
        armado.append(amaterno);
        armado.append(", tengo ");
        armado.append(edad);
        armado.append(" años y soy de ");
        armado.append(nacionalidad);
        System.out.println(armado);
        String resultado = armado.toString();
        return resultado;
    }
}
