package Basic;

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

    private static float base, altura, cons = 2;
    //Area de un Triangulo = Base * Altura / 2
    
    private static int area;
    //Almacena el resultado esperado

    public static void Ejercicio2() {

        System.out.println("Ingresa el valor de la base: ");
        base = scan.nextFloat(); //Almacenar el valor de la base como flotante.

        System.out.println("Ingresa el valor de la altura: ");
        altura = scan.nextFloat(); //Almacenar el valor de la altura como flotante.

        area = Math.round(base * altura / cons);
        //Se realiza la ecuacion para hallar el area, y se da el resultado en entero.

        System.out.println("El area aproximada del triangulo es: " + area);

    }
}
