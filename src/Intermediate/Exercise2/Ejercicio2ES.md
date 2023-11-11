<h2>INTERMEDIO -> EJERCICIO 2</h2>

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

*Tener en cuenta: Una vez realizado un proceso, desplegar nuevamente el listado.*

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
Ingresa fondos (opcional): 0
-Cuenta Creada con Éxito-
-Fondos Actuales: 0-

===================
 Elige una opcion:
===================
1. Crear cuenta.
2. Ver fondos.
3. Agregar fondos.
4. Retirar fondos.
5. Salir.
-> 2
Ingresa tu nombre de usuario: dvchinx
-Fondos Actuales: 0-

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

===================
 Elige una opcion:
===================
1. Crear cuenta.
2. Ver fondos.
3. Agregar fondos.
4. Retirar fondos.
5. Salir.
-> 4
Ingresa tu nombre de usuario: dvchinx
Fondos a Retirar: 100
-Fondos Retirados con Éxito-
-Fondos Actuales: 100-

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
