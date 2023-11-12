package Intermediate.Exercise2.SolutionES;

import java.util.Scanner;

/**
 *
 * @author dvchinx
 */
public class ExecSolve {

    private static Scanner scan = new Scanner(System.in);
    //Libreria para recibir entrada del usuario.

    private static String cadena, caracter;
    //Almacena la cadena original ingresada por el usuario.
    //Almacena el caracter original ingresado por el usuario.

    private static int nChars;
    //Almacena el número de cáracteres encontrados en la cadena.

    public static void main(String[] args) {
        System.out.println("-Contador de Carácter en una Cadena-\n");

        System.out.print("Ingresa la Cadena: ");
        cadena = scan.nextLine();

        System.out.print("Ingresa el Carácter a Contar: ");
        caracter = scan.next();

        nChars = contarCaracter(cadena);

        System.out.println("\nLa Cadena Cuenta con: "+nChars+" '"+caracter+"'.");
    }

    public static int contarCaracter(String cadena) {
        int count = 0;
        String letter;

        if (caracter.length() == 1) { 
        //Si String:(caracter) es un solo cáracter, entonces continuar
            for (int i = 0; i < cadena.length(); i++) { 
            //Se recorre cada cáracter de la cadena
                letter = cadena.substring(i, i + 1); 
                //Letter es igual al cáracter recorrido en el momento
                if (letter.equals(caracter)) { 
                //Se compara el cáracter del momento con el que se cuenta
                    count++;
                    //Se aumenta en uno la cantidad de cáracteres encontrados.
                }
            }

        } else { 
        //Si String:(cadena) no es un solo cáracter, imprimir error y forzar cierre.
            System.out.println("\nError, debes agregar un solo carácter.");
            System.exit(0);
        }
        return count;

    }
}
