package Intermediate.Ejercicio1;

import java.util.Scanner;
import Intermediate.Ejercicio1.Suma;
import Intermediate.Ejercicio1.Resta;

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
    6- Debe recibir los literales en punto decimal y dar el resultado en entero aproximado.
     */
    private static Suma suma = new Suma();
    private static Resta resta = new Resta();
    private static Multp multp = new Multp();
    private static Div div = new Div();

    private static Scanner scan = new Scanner(System.in);
    //Libreria para recibir entrada del usuario.

    private static int opcion, result;
    //Variable que almacena la opcion elegida por el usuario.
    //Variable que almacena el resultado de la operacion.

    private static float a, b;
    //Variables que almacenan los literales de la operacion.

    public static void Exec() {

        System.out.println("===================");
        System.out.println(" Elige una opcion:");
        System.out.println("===================");
        System.out.println("1 Sumar.");
        System.out.println("2. Restar.");
        System.out.println("3. Multiplicar.");
        System.out.println("4. Dividir.");
        System.out.println("5. Salir.");

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
            case 1: //Suma

                System.out.print("Ingresa el Primer Valor: ");
                suma.setA(scan.nextFloat());
                System.out.print("Ingresa el Segundo Valor: ");
                suma.setB(scan.nextFloat());

                result = suma.Operacion(suma.getA(), suma.getB());
                System.out.println("El Resultado Aproximado de la Suma es: " + result);
                break;

            case 2: //Resta

                System.out.print("Ingresa el Primer Valor: ");
                resta.setA(scan.nextFloat());
                System.out.print("Ingresa el Segundo Valor: ");
                resta.setB(scan.nextFloat());

                result = resta.Operacion(resta.getA(), resta.getB());
                System.out.println("El Resultado Aproximado de la Resta es: " + result);
                break;

            case 3: //Multiplicacion

                System.out.print("Ingresa el Primer Valor: ");
                multp.setA(scan.nextFloat());
                System.out.print("Ingresa el Segundo Valor: ");
                multp.setB(scan.nextFloat());

                result = multp.Operacion(multp.getA(), multp.getB());
                System.out.println("El Resultado Aproximado de la Multiplicacion es: " + result);
                break;

            case 4: //Division

                System.out.print("Ingresa el Primer Valor: ");
                div.setA(scan.nextFloat());
                System.out.print("Ingresa el Segundo Valor: ");
                div.setB(scan.nextFloat());

                result = div.Operacion(div.getA(), div.getB());
                System.out.println("El Resultado Aproximado de la Division es: " + result);
                break;

            case 5: //Salir
                System.exit(0);
                
            default: //En caso de que ingrese una opcion inexistente (3>x<1)
                System.out.println("Error, esa opcion no existe.");
                break;
        }
    }

}
