package Basics;

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
    //Libreria para recibir entrada del usuario
    
    public static void Ejercicio1() {
        System.out.println("Ingresa el primer valor (puede ser decimal): ");
        float a = scan.nextFloat(); //Almacena la primera variable como numero flotante (0,n...).
        
        System.out.println("Ingresa el segundo valor: ");
        float b = scan.nextFloat(); //Almacena la segunda variable como numero flotante (0,n...).
        
        int c = (int) (a+b); //Suma las dos varaibles flotantes y el resultado lo convierte en Entero.
        System.out.println("El resultado aproximado de la suma es: " + c);
    }
}
