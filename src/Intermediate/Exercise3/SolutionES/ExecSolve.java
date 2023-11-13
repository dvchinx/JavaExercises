package Intermediate.Exercise3.SolutionES;

import java.util.Scanner;

/**
 *
 * @author dvchinx
 */
public class ExecSolve {

    private static Scanner scan = new Scanner(System.in);
    //Libreria para recibir entrada del usuario.
    
    private static int number;
    //Almacena el número original ingresado por el usuario.

    public static void main(String[] args) {
        System.out.println("-Calcular un Número en la Secuencia de Fibonacci-\n");
        
        System.out.print("Ingresa un Número: ");
        number = scan.nextInt();

        System.out.print("Fibonacci de "+number+" es "+Fibonacci(number)+".");
    }

    public static int Fibonacci(int number) {
        if ((number == 1) || (number == 2)) { 
        //Si es uno o dos: regresa 1
            return 1;
        } else {
            return Fibonacci(number - 1) + Fibonacci(number - 2);
            //(Numero ingresado-1) + (Numero ingresado-2) 
        }
    }

}
