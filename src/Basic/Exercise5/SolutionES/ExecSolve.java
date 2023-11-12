package Basic.Exercise5.SolutionES;

import java.util.Scanner;

/**
 *
 * @author dvchinx
 */
public class ExecSolve {
    
    private static Scanner scan = new Scanner(System.in);
    //Libreria para recibir entrada del usuario.
    
    private static int a, b;
    //Almacenaran las entradas del usuario.
    
    private static int result;
    //Variable resultante de la operacion.
    
    public static void main(String[] args) {
        System.out.println("-Calcular Máximo Común Divisor de Dos Números-\n");
        
        System.out.print("Ingresa el primer valor: ");
        a = scan.nextInt();
        
        System.out.print("Ingresa el segundo valor: ");
        b = scan.nextInt();
        
        result = calcularMCD(a, b);
        
        System.out.println("El MCD de "+a+" y "+b+" es: "+result);
    }
    
    // Método para calcular el MCD utilizando el algoritmo de Euclides
    public static int calcularMCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
