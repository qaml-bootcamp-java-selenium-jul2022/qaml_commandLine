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


        //Ejercicio CARACTER EN DETERINADA POSICION
        System.out.println("\n-----------------EJERCICIO DE CARACTER EN POSICION - charAt-------------------");
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

        //Ejercicio POSICION DE CARACTER
        System.out.println("\n-----------------EJERCICIO DE POSICION DE CARACTER -indexOf -------------------");
        System.out.println("Caso positivo:"+
                posicionDeDeterminadoCaracter('e',resultadoEsperado));//E->0,e->2,a->-1
        System.out.println("caso negativo:"+
                posicionDeDeterminadoCaracter('a',resultadoEsperado));//E->0,e->2,a->-1


        //Ejercicio CARACTER EN DETERINADA POSICION
        System.out.println("\n-----------------EJERCICIO DE CARACTER EN POSICION - charAt-------------------");
        System.out.println("caso negativo:"+
                caracterEnDeterminadoIndiceDeLaCadena(50, resultadoActual,'*')
        );

        System.out.println("Caso positivo:"+
                caracterEnDeterminadoIndiceDeLaCadena(9, resultadoActual,'*')
        );

        //Ejercicio Replace
        System.out.println("\n-----------------EJERCICIO DE REPLACE-------------------");
        System.out.println("caso negativo:"+
                reemplazarCaracterEnCadena(resultadoActual,'*', '#')
        );

        System.out.println("Caso positivo:"+
                reemplazarCaracterEnCadena(resultadoActual,'i', '#')
        );

        //Ejercicio StartsWith and EndsWith
        System.out.println("\n-----------------EJERCICIO DE StartsWith and EndsWith-------------------");
        System.out.println("Resultado metodo startswith-endswith: "+ metodoContieneCadena("CadenaTest","Test"));

        //Ejercicio StringBuilder - Insert
        System.out.println("\n-----------------EJERCICIO DE StringBuilder - Insert -------------------");
        System.out.println(insertarCharsEnCadena("Hola mundo", '*', 6));

        //Ejercicio StringBuilder - Append
        System.out.println("\n-----------------EJERCICIO DE StringBuilder - Append-------------------");
        System.out.println(informacionUsuario("Alvaro", "Meraz", 28, "Mexicano"));
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

    static String reemplazarCaracterEnCadena (String palabra, char cadena, char cadenaReemplazo){
        String nuevoString = "";
        if(palabra.indexOf(cadena)==-1){
            return null;
        }
        nuevoString = palabra.replace(cadena,cadenaReemplazo);
        return nuevoString;
    }

    static boolean metodoContieneCadena(String cadena1, String cadena2){
        //boolean resultado = false;

        //resultado = (cadena1.startsWith(cadena2)|| cadena1.endsWith(cadena2));


        return ((cadena1.startsWith(cadena2) || cadena1.endsWith(cadena2))?
                true
                :
                false);
    }


    static String insertarCharsEnCadena (String cadena, char caracterAInsertar, int posicion){
        System.out.println("El tamanio de la cadena antes e la insercion: "+cadena.length());
        StringBuilder constructorDeCadena = new StringBuilder(cadena);
        constructorDeCadena.insert(posicion, caracterAInsertar);
        System.out.println("El tamanio de la cadena antes e la insercion: "+constructorDeCadena.length());
        return constructorDeCadena.toString();
    }


    static String informacionUsuario(String nombre, String apellidoPaterno, int edad, String nacionalidad){
        StringBuilder cadena = new StringBuilder();
        cadena.append("Me llamo ");
        cadena.append(nombre);
        cadena.append(" ");
        cadena.append(apellidoPaterno);
        cadena.append(", tengo ");
        cadena.append(edad);
        cadena.append(" años y soy ");
        cadena.append(nacionalidad);
        //Me llamo nombre apellidoPaterno, tengo edad años y soy nacionalidad
        return cadena.toString();
    }


}
