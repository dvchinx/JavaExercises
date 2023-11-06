package Intermediate.Ejercicio1;

import java.util.Scanner;
import Intermediate.Ejercicio1.Suma;

/**
 *
 * @author dvchinx
 */
public class Exec {
    
    /*
    INTERMEDIATE -> EJERCICIO 1:
    Crear una calculadora básica.
    1- Usar Polimorfismo y Herencia.
    2- Usar try/catch e if o switch.
    3- Crear una clase independiente para cada operacion aritmetica.
    4- Tener en cuenta posibles errores de entrada.
    5- Debes permitir hacer suma, resta, multiplicación y división.
    */
    
    private static Suma suma;
    
    private static Scanner scan = new Scanner(System.in);
    //Libreria para recibir entrada del usuario.
    
    private static int opcion, result;
    //Variable que almacena la opcion elegida por el usuario.
    //Variable que almacena el resultado de la operacion.
    
    private static float a, b;
    //Variables que almacenan los literales de la operacion.
    
    public static void Exec(){
        
        System.out.println("===================");
        System.out.println(" Elige una opcion:");
        System.out.println("===================");
        System.out.println("1 Sumar.");
        System.out.println("2. Restar.");
        System.out.println("3. Multiplicar.");
        System.out.println("4. Dividir.");
        System.out.println("3. Salir.");
        
        try
        {
            //En caso de que ingrese un numero, continuara correctamente.
            opcion = scan.nextInt();
            
        }
        catch(Exception e)
        {
            //En caso de que ingrese algo diferente a un numero, enviara este 
            //mensaje y se detendrá el programa.
            System.out.println("Error, por favor ingresa un valor entero.");
            System.exit(0);
        }
        
        switch(opcion){
            case 1: //Suma
                    
                    System.out.println("Ingresa el Primer Valor:");
                    suma.setSumaA(scan.nextFloat());
                    System.out.println("Ingresa el Segundo Valor:");
                    suma.setSumaB(scan.nextFloat());
                    
                    System.out.println("suma = " + suma.getSumaA());
                    System.out.println("suma = " + suma.getSumaB());
                    
                break;
        }
    }
    
}
