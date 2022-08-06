package EjercicioString;

public class MainEjercicioString {

    public static void main(String[] args){

        char[] arreglochar = new char[]{'H','o','l','a'};

        String  str1char = new String(arreglochar);
        System.out.println(str1char);
        String str1 = new String("Hola");
        String str2 = new String("Hola");

        boolean objectosiguales = str1.equals(str2);
        System.out.println(objectosiguales);

        String str3 = "HolSystem.out.println(a";
        String str4 = "Hola";

        boolean cadenasiguales = str1.equals(str2);
        System.out.println(cadenasiguales);

        System.out.println("Hola".equals("Hola"));

        String ejercicio1 = "Ejercicio 1 String";
        String ejercicio2 = "Ejercicio 11 String";

        System.out.println(ejercicio1.equals(ejercicio2));
        System.out.println(ejercicio1.compareTo(ejercicio2));

        System.out.println(ejercicio1.compareTo(ejercicio2) !=0 ? true:false);
        System.out.println(ejercicio1.compareTo(ejercicio2) !=0 ?
                "la cadena no es igual":
                "la cadena es igual");

        System.out.println(valorindice(ejercicio1,7));

    }
    static char valorindice(String cadena, int indice){
        char caracterenindice='"';

        if(indice <cadena.length()){
            caracterenindice =  cadena.charAt(indice);
        }

        return caracterenindice;
    }

}
