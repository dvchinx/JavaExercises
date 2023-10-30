package Basics;

import java.util.Scanner;

/**
 *
 * @author dvchinx
 */
public class Ejercicio2 {
    
    /*
    BASICS -> EJERCICIO 2:
    Calcular el área de un triangulo.
     */
    
    private static Scanner scan = new Scanner(System.in);
    //Libreria para recibir entrada del usuario
    
    public static void Ejercicio2(){
        //Area de un Triangulo = Base * Altura / 2
        float base, altura, cons=2;
        
        System.out.println("Ingresa el valor de la base: ");
        base = scan.nextFloat();
        
        System.out.println("Ingresa el valor de la altura: ");
        altura = scan.nextFloat();
        
        int area = (int) ((int) base * altura / cons);
        System.out.println("El area aproximada del triangulo es: " + area);
        
    }
}
