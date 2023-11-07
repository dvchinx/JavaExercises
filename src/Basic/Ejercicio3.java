package Basic;

import java.util.Scanner;

/**
 *
 * @author dvchinx
 */
public class Ejercicio3 {

    /*
    BASICS -> EJERCICIO 3:
    Conversión de grados Celsius a Fahrenheit y viceversa.
    1- Teniendo en cuenta posibles errores de entrada)
    2- Debes implementar el uso de try/catch y if o switch.
     */
    private static Scanner scan = new Scanner(System.in);
    //Libreria para recibir entrada del usuario.

    private static int opcion;
    //Variable que almace el orden de la conversion.

    private static float cels, fahr;
    //Variables que almacenaran tanto la entrada como la salida de la ecuacion.

    public static void Ejercicio3() {

        //Se da al usuario la opción de elegir el orden de la conversion.
        System.out.println("===================");
        System.out.println(" Elige una opcion:");
        System.out.println("===================");
        System.out.println("1. Celsius -> Fahrenheit.");
        System.out.println("2. Fahrenheit -> Celsius.");
        System.out.println("3. Salir.");

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
            case 1: //Celsius -> Fahrenheit

                //Formula: (°C * 1,8) + 32
                System.out.print("°C = ");
                cels = scan.nextFloat();

                fahr = (cels * 1.8f) + 32;
                System.out.print("°F = " + fahr);

                break;

            case 2: //Fahrenheit -> Celsius

                //Formula: (°F - 32) / 18
                System.out.print("°F = ");
                fahr = scan.nextFloat();

                cels = (fahr - 32) / 1.8f;
                System.out.print("°C = " + cels);

                break;

            case 3: //Salir

                System.exit(0); //Forza el cierre del programa.
                break;

            default: //En caso de que ingrese una opcion inexistente (3>x<1)
                System.out.println("Error, esa opcion no existe.");
                break;
        }

    }
}
