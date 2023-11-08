package Basic.Exercise1;

import java.util.Scanner;

/**
 *
 * @author dvchinx
 */
public class ExecSolve {

    private static Scanner scan = new Scanner(System.in);
    //Libreria para recibir entrada del usuario.

    private static float a, b;
    //Almacenaran las entradas del usuario.

    private static int c;
    //Variable resultante de la operacion.

    public static void main(String[] args) {

        System.out.println("Ingresa el primer valor (puede ser decimal): ");
        a = scan.nextFloat(); //Almacena la primera variable como numero flotante (0,n...).

        System.out.println("Ingresa el segundo valor: ");
        b = scan.nextFloat(); //Almacena la segunda variable como numero flotante (0,n...).

        c = Math.round(a + b); //Suma las dos varaibles flotantes y las redondea.
        System.out.println("El resultado aproximado de la suma es: " + c);
    
    }
}
