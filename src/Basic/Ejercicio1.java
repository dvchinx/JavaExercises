package Basic;

import java.util.Scanner;

/**
 *
 * @author dvchinx
 */
public class Ejercicio1 {

    /*
    BASICS -> EJERCICIO 1:
    Suma de dos números.
     */
    private static Scanner scan = new Scanner(System.in);
    //Libreria para recibir entrada del usuario.

    private static float a, b;
    //Almacenaran las entradas del usuario.

    private static int c;
    //Variable resultante de la operacion.

    public static void Ejercicio1() {

        System.out.println("Ingresa el primer valor (puede ser decimal): ");
        a = scan.nextFloat(); //Almacena la primera variable como numero flotante (0,n...).

        System.out.println("Ingresa el segundo valor: ");
        b = scan.nextFloat(); //Almacena la segunda variable como numero flotante (0,n...).

        c = (int) (a + b); //Suma las dos varaibles flotantes y el resultado lo convierte en Entero.
        System.out.println("El resultado aproximado de la suma es: " + c);
    }
}
