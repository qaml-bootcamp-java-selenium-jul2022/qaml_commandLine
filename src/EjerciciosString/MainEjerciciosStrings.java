package EjerciciosString;

public class MainEjerciciosStrings {

    public static void main(String[] args) {
        char[] arregloDeChars = new char[]{'H', 'o', 'l', 'a'};

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

        System.out.println("Resultado metodo reemplaza: " + metodoReemplaza("testa", "test"));

        System.out.println("Resultado metodo startswith-endswith: "+ metodoBooleano("CadenaTest","Test"));

        //Ejemplo String Builder

        System.out.println(
                insertarCharEnCadena("Hola mundo",'*', 6)
        );

        System.out.println(
                informacionUsuario("Alvaro","Meraz",28,"Mexicano")
        );
    }

    static char caracterEnDeterminadoIndiceDeLaCadena(int indice, String cadena) {
        //Paso 1: Validar que el índice se encuentre dentro del tamaño de la cadena
        char caracterEnIndice = '"';
        if (indice < cadena.length()) {
            //Paso 2: Asignar a la variable que retornamos el valor de charAt(indice)
            caracterEnIndice = cadena.charAt(indice);
        }
        return caracterEnIndice;
    }

    static char caracterEnDeterminadoIndiceDeLaCadena(int indice, String cadena, char caracterReemplazoDeVacios) {
        //Paso 1: Validar que el índice se encuentre dentro del tamaño de la cadena
        char caracterEnIndice = ' ';
        //cadena = cadena.replace(' ', caracterReemplazoDeVacios);
        if (indice < cadena.length()) {
            //Paso 2: Asignar a la variable que retornamos el valor de charAt(indice)
            caracterEnIndice = cadena.replace(' ', caracterReemplazoDeVacios).charAt(indice);
        }
        return caracterEnIndice;
    }

    static String metodoReemplaza(String cadena1, String cadenaReemplazo) {
        String cadenaNueva = null;
        if (!cadena1.equals(cadenaReemplazo)) {
            if (cadena1 != "") {
                cadenaNueva = cadena1;
                cadenaNueva = cadenaNueva.replace(cadena1, cadenaReemplazo);
            }
        }

        return cadenaNueva;
    }

    static boolean metodoBooleano(String cadena1, String cadena2){
        //boolean resultado = false;

        //resultado = (cadena1.startsWith(cadena2)|| cadena1.endsWith(cadena2));


        return (cadena1.startsWith(cadena2) || cadena1.endsWith(cadena2))?
                true
                :
                false;
    }
    static String insertarCharEnCadena(String cadena, char caracterAInsertar, int posicion){
        System.out.println("El tamaño de la cadena ANTES de la insercion: "+ cadena.length());
        StringBuilder constructorDeCadena = new StringBuilder(cadena);
        constructorDeCadena.insert(posicion,caracterAInsertar);
        System.out.println("El tamaño de la cadena DESPUES de la insercion: " + constructorDeCadena.length());
        return constructorDeCadena.toString();
    }

    static String informacionUsuario(String nombre, String apellidoPaterno, int edad, String Nacionalidad){
        StringBuilder persona = new StringBuilder();
        System.out.println("Tamaño de la cadena ANTES de usar append(): " + persona.length());
        persona.append("Me llamo ");
        persona.append(nombre + " ");
        persona.append(apellidoPaterno);
        persona.append(", tengo ");
        persona.append(edad);
        persona.append(" años y soy ");
        persona.append(Nacionalidad);
        System.out.println("Tamaño de la cadena DESPUES de usar append(): " + persona.length());
        return persona.toString();
    }
}
