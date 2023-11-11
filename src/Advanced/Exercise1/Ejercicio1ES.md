<h2>AVANZADO -> EJERCICIO 1</h2>

**SISTEMA DE CUENTA (BANCO):**

1- Recibir entrada del usuario con la libreria *Java.Util.Scanner*.

2- Implementar en consola un listado con las siguientes opciones:
* Crear una cuenta.
* Ver fondos.
* Agregar fondos.
* Retirar fondos.
* Salir *-System.exit(0)-*.

2- Crear una *clase* llamada *"Cuenta"* con:
* Los atributos *String(Titular), float(Fondos)*
* Crear sus métodos *get, set y toString*.
* Tendrá 2 métodos especiales: ingresar(*double:cantidad*), retirar(*double cantidad*)
* Titular será obligatorio, fondos:opcional.

3- Hacer uso de *try/catch* para posibles errores de entrada del usuario:
* Ingresar un índice que no esté registrado en la lista.
* Ingresar valores no esperados al realizar las operaciones.

*Tener en cuenta:*
* *Una vez realizado un proceso, desplegar nuevamente el listado.*
* *Uso obligatorio de Map y HashMap para la creación de varias cuentas.*

<h2>EJEMPLO:</h2>

**Consola:**

```
===================
 Elige una opcion:
===================
1. Crear cuenta.
2. Ver fondos.
3. Agregar fondos.
4. Retirar fondos.
5. Salir.
-> 1
Ingresa un nombre de usuario: dvchinx
Ingresa fondos (opcional): 10
-Cuenta Creada con Éxito-
-Fondos Actuales: 10-

===================
 Elige una opcion:
===================
1. Crear cuenta.
2. Ver fondos.
3. Agregar fondos.
4. Retirar fondos.
5. Salir.
-> 1
Ingresa un nombre de usuario: accMel
Ingresa fondos (opcional): 250,5
-Cuenta Creada con Éxito-
-Fondos Actuales: 250,5-

===================
 Elige una opcion:
===================
1. Crear cuenta.
2. Ver fondos.
3. Agregar fondos.
4. Retirar fondos.
5. Salir.
-> 2
Ingresa tu nombre de usuario: accMel
-Fondos Actuales: 250,5-

===================
 Elige una opcion:
===================
1. Crear cuenta.
2. Ver fondos.
3. Agregar fondos.
4. Retirar fondos.
5. Salir.
-> 3
Ingresa tu nombre de usuario: dvchinx
Fondos a Agregar: 200
-Fondos Agregados con Éxito-
-Fondos Actuales: 210-

===================
 Elige una opcion:
===================
1. Crear cuenta.
2. Ver fondos.
3. Agregar fondos.
4. Retirar fondos.
5. Salir.
-> 4
Ingresa tu nombre de usuario: accMel
Fondos a Retirar: 50,5
-Fondos Retirados con Éxito-
-Fondos Actuales: 200-

===================
 Elige una opcion:
===================
1. Crear cuenta.
2. Ver fondos.
3. Agregar fondos.
4. Retirar fondos.
5. Salir.
-> 5
-Gracias por Elegirnos, Vuelva Pronto-
```
