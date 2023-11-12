package Basic.Exercise6.SolutionES;

import java.util.Scanner;

/**
 *
 * @author dvchinx
 */
public class ExecSolve {
    
    private static Scanner scan = new Scanner(System.in);
    //Libreria para recibir entrada del usuario.
    
    private static String originalCadena, cadenaLimpia, reversoCadena;
    //Almacena la cadena original ingresada por el usuario.
    /*Almacena una copia de la cadena original pero: todo en minúscula
    y la cadena sin espacios (junta en una sola palabra).*/
    //Almacena la cadena original dada al revés.
    
    public static void main(String[] args) {
        System.out.println("-Verificar si la Cadena es Palíndromo-\n");
        
        System.out.print("Ingresa la cadena: ");
        originalCadena = scan.nextLine();
        
        if(esPalindromo(originalCadena)){
            System.out.println("'"+originalCadena+"' es un palíndromo.");
        }else{
            System.out.println("'"+originalCadena+"' no es un palíndromo.");
        }
        
    }
    
    // Método para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String str) {
        //Eliminar espacios en blanco y convertir a minúsculas
        cadenaLimpia = str.replaceAll("\\s", "").toLowerCase();
        
        //Comparar la cadena original con su reverso
        reversoCadena = new StringBuilder(cadenaLimpia).reverse().toString();
        return cadenaLimpia.equals(reversoCadena);
    }
}
