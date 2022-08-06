package EjerciciosString;


public class MainEjerciciosString {

    public static void main(String[] args) {
        //usar equals
        char [] arregloDeChars = new char[] {'H','o','l','a'};
        String str1 = new String(arregloDeChars);
        String str2 = new String("Hola");

        boolean objetosiguales = str1.equals(str2);
        System.out.println(objetosiguales); //TRUE

        boolean objetosiguales2 = str1.toLowerCase().equals(str2);
        System.out.println(objetosiguales2); //FALSE

        String str3 = "Hola";
        String str4 = "Hola";

        boolean cadenasiguales = str3.equals(str4);
        System.out.println(cadenasiguales); //TRUE

        System.out.println("Adios".equals("Adios"));  //TRUE


        //comparar cadenas
        String resultadoEsperado = "Ejercicio 1 Strings"; //Diferencia aqui numeros positivos
        String resultadoActual = "Ejercicio 11 Strings"; //Diferencia aqui numeros negativos

        System.out.println(resultadoEsperado.equals(resultadoActual)); //false
        System.out.println(resultadoEsperado.compareTo(resultadoActual)); //0 si son iguales //<>0 si son diferentes
        // >0 si la diferencia esta en la primera cadena //<0 si la difererncia esta en la segunda cadena

        System.out.println(resultadoActual.compareTo(resultadoEsperado)); //0 si son iguales //<>0 si son diferentes
        // >0 si la diferencia esta en la primera cadena //<0 si la difererncia esta en la segunda cadena

        //Lambda If validation
        System.out.println((resultadoEsperado.compareTo(resultadoActual) != 0)
                ? "Las cadenas son diferentes"
                : "Las cadenas son iguales");


        System.out.println(caracterEnDeterminadoIndiceDeLaCadena(50,resultadoActual));
    }

    static char caracterEnDeterminadoIndiceDeLaCadena (int indice, String cadena){
        //Paso 1: Validar que el indice se encuentre dentro del tamano de la cadena
        char caracterEnIndice = '"';
        if(indice<cadena.length()){
            //Paso 2: Asignar a la variable que retornamos el valor de CharAt
            caracterEnIndice = cadena.charAt(indice);
        }
        return caracterEnIndice;

    }


}
