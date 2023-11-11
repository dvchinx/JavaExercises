package Basic.Exercise2.SolutionES;

import java.util.Scanner;

/**
 *
 * @author dvchinx
 */
public class ExecSolve {

    private static Scanner scan = new Scanner(System.in);
    //Libreria para recibir entrada del usuario

    private static float base, altura;
    //Area de un Triangulo = Base * Altura / 2

    private static final int cons = 2;
    //Creacion de constante
    
    private static int area;
    //Almacena el resultado esperado

    public static void main(String[] args) {
    
        System.out.println("Ingresa el valor de la base: ");
        base = scan.nextFloat(); //Almacenar el valor de la base como flotante.

        System.out.println("Ingresa el valor de la altura: ");
        altura = scan.nextFloat(); //Almacenar el valor de la altura como flotante.

        area = Math.round(base * altura / cons);
        //Se realiza la ecuacion para hallar el area, y se da el resultado en entero.

        System.out.println("El area aproximada del triangulo es: " + area);
        
    }
    
}
