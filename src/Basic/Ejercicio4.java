package Basic;

import java.util.Scanner;

/**
 *
 * @author dvchinx
 */
public class Ejercicio4 {
    
    /*
    BASICS -> EJERCICIO 4:
    Verificar si un numero es par o impar.
    1- Teniendo en cuenta posibles errores de entrada)
    2- Debes implementar el uso de try/catch y if o switch.
     */
    
    private static Scanner scan = new Scanner(System.in);
    //Libreria para recibir entrada del usuario.
    
    private static int opcion, num;
    //Variable que almacena la opcion elegida por el usuario.
    //Variable que almacena el numero a verificar si es par/impar. 
    
    public static void Ejercicio4(){
        
        //Se da al usuario la opción de verificar si es par o impar.
        System.out.println("===================");
        System.out.println(" Elige una opcion:");
        System.out.println("===================");
        System.out.println("1. Verificar si es par.");
        System.out.println("2. Verificar si es impar.");
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
        
        switch (opcion){
            
            case 1: //Verificar si es par
                    
                    System.out.print("Ingresa el valor a verificar:");
                    num = scan.nextInt();
                    
                    if(num%2==0){
                        System.out.println("El número es par.");
                    }else{
                        System.out.println("El número no es par (es impar).");
                    }
                break;
                
            case 2: //Verificar si es impar
                    
                    System.out.print("Ingresa el valor a verificar:");
                    num = scan.nextInt();
                    
                    if(num%2!=0){
                        System.out.println("El número es impar.");
                    }else{
                        System.out.println("El número no es impar (es par).");
                    }
                break;
                
            case 3: //Salir
                    System.exit(0);
                break;
                
            default: //En caso de que ingrese una opcion inexistente (3>x<1)
                System.out.println("Error, esa opcion no existe.");
                break;
        }
        
    }
}
