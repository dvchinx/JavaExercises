package Advanced.Exercise1.SolutionES;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author dvchinx
 */
public class Exec {

    private static Scanner scan = new Scanner(System.in);
    //Libreria para recibir entrada del usuario.
    
    private static int opcion;
    //Variable que almacena la opcion elegida por el usuario.

    private static Map<String, Cuenta> instancias = new HashMap<>();
    //Lista que guardará las diferentes cuentas.
    
    private static Cuenta objCuenta, objBuscar;
    //Objeto que almacena al crear una nueva cuenta.
    //Objeto que permite usar una cuenta específica.

    private static String titular;
    //Variable que almacenará localmente el titular.
    private static float fondos;
    //Variable que almacenará localmente los fondos.

    public static void main(String[] args) {
        System.out.println("\n===================");
        System.out.println(" Elige una opcion:");
        System.out.println("===================");
        System.out.println("1. Crear cuenta.");
        System.out.println("2. Ver fondos.");
        System.out.println("3. Agregar fondos.");
        System.out.println("4. Retirar fondos.");
        System.out.println("5. Salir.");
        System.out.print("-> ");

        try {
            //En caso de que ingrese un numero, continuara correctamente.
            opcion = scan.nextInt();

        } catch (Exception e) {
            //En caso de que ingrese algo diferente a un numero, enviara este 
            //mensaje y se detendrá el programa.
            System.out.println("Error, por favor ingresa un valor entero.");
            System.exit(0);
        }

        switch (opcion) {
            case 1: //Crear cuenta
                try {
                System.out.print("Ingresa un nombre de usuario: ");
                    titular = scan.next();
                    // Crear una nueva instancia de la clase MiClase
                objCuenta = new Cuenta(titular);
                    instancias.put(titular, objCuenta);

                System.out.print("Ingresa fondos (opcional): ");
                    objBuscar = instancias.get(titular);    
                    fondos = scan.nextFloat();
                    objBuscar.setFondos(fondos);
                
                System.out.print("-Cuenta Creada con Éxito-");
                System.out.print("\n-Fondos Actuales: "+objBuscar.getFondos()+"-");
                main(args);
            } catch (Exception e) {
                System.out.print("\nError.");
            }

            break;

            case 2: //Ver fondos
                try{
                System.out.print("Ingresa tu nombre de usuario: ");
                    titular = scan.next();
                    objBuscar = instancias.get(titular);
                    
                System.out.print("-Fondos Actuales: "+objBuscar.getFondos()+"-");
                main(args);
                }catch(Exception e){
                    System.out.println("\nError.");
                }
                break;

            case 3: //Agregar fondos
                try{
                System.out.print("Ingresa tu nombre de usuario: ");
                    titular = scan.next();
                    objBuscar = instancias.get(titular);
                    
                System.out.print("Fondos a Agregar: ");
                    fondos = scan.nextFloat();
                    objBuscar.ingresar(fondos);
                    
                System.out.print("-Fondos Agregados con Éxito-");
                System.out.print("-Fondos Actuales: "+objBuscar.getFondos()+"-");
                main(args);
                }catch(Exception e){
                    System.out.print("\nError.");
                }
                break;

            case 4: //Retirar fondos
                try{
                System.out.print("Ingresa tu nombre de usuario: ");
                    titular = scan.next();
                    objBuscar = instancias.get(titular);
                    
                System.out.print("Fondos a Retirar: ");
                    fondos = scan.nextFloat();
                    objBuscar.retirar(fondos);
                    
                System.out.print("-Fondos Retirados con Éxito-");
                System.out.print("-Fondos Actuales: "+objBuscar.getFondos()+"-");
                main(args);
                }catch(Exception e){
                    System.out.print("Error.");
                }
                break;

            case 5: //Salir
                System.exit(0);
                break;
        }
    }

}
