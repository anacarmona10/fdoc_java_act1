package actividad1;

import org.w3c.dom.Text;
import java.util.Arrays;

public class EjerciciosActividad1 {
    public static void main(String[] args) {
        // --- Declaración de variables ---       
        int num1 = 5;
        double numD1 = 3.121632;
        String texto = "Don't get comfortable cause' any minute now";

        System.out.println(num1);
        System.out.println(numD1);
        System.out.println(texto);
   
        
        int suma = num1 + num1;

        System.out.println("La suma da " + suma);

        

        String texto2 = "Hands off Gabriela";
        System.out.println(texto2);

        int[] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        System.out.println(Arrays.toString(numeros));

        class Persona {
            String nombre;
            int edad;

            Persona(String nombre, int edad){
                this.nombre = nombre;
                this.edad= edad;
            };

            void mostrarDatos(){
                System.out.println("Nombre: " +nombre);
                System.out.println("Edad: " + edad + " años");
            }
        }

        Persona persona1 = new Persona("Ana", 17);

        persona1.mostrarDatos();




        // --- Tipos de datos primitivos ---       
        // TODO: Implementación en main
        byte num2 = 10;
        short num3 = -10;
        int num4 = 2;
        long num5 = 372036854;
        float num6 = 3;
        double num7 = 54.8888;
        boolean booleano = true;
        char uno = 1;

        System.out.println("El byte " + num2 + " El short " + num3 + " El int " + num4 + " El long " + num5 + " El float " + num6 + "El double " + num7 + " El boolean " + booleano + " El char " + uno);
        
        if (booleano) {
            System.out.println("El booleano en este momento es true");
        } else {
            System.out.println("En este momento el booleano es false");
        }

        // --- Tipos de datos no primitivos ---       
        // TODO: Implementación en main

        // --- Operadores aritméticos ---       
        // TODO: Implementación en main

        int entero1 = 10;
        int entero2 = 20;

        int suma2 = entero1 + entero2;
        int resta = entero2 - entero1;
        int multiplicacion = entero1 * entero2;
        int division1 = entero2/entero1;
        int modulo = entero1 % entero2;

        double division2 = entero1/entero2;

        System.out.println("Entre los dos enteros la suma es " + suma2 + ", la resta es " + resta + ", la multiplicacion es " + multiplicacion + "La división que da como resultado un entero es " + division1 + ", el módulo es " + modulo + ". Por último, la división que da un decimal es " + division2);


        // --- Operadores de asignación ---       
        // TODO: Implementación en main

        int x = 10;

        x += 5;  // ahora x = 15
        x -= 3;  // ahora x = 12
        x *= 2;  // ahora x = 24
        x /= 4;  // ahora x = 6
        x %= 5;  // ahora x = 1. Este operador hace la operación 6/5 y le asigna el residuo a la variable.

        System.out.println("Valor final de x: " + x);

        int y = 24;
        y %= 2;

        System.out.println("El resultado final de y es " + y + " , esto debido a que agarra el valor original de y (en este caso 24) y le hace el módulo 2, que demuestra que es par dando este resultado como residuo de la división 24/2");

        // --- Operadores de comparación ---       
        // TODO: Implementación en main

        int comparado1 = 1;
        int comparado2 = 2;

        boolean comparacion1 = comparado1 == comparado2;
        boolean comparacion2 = comparado1 != comparado2;

        System.out.println("Los comparados son iguales? " + comparacion1);
        System.out.println("Entonces son diferentes? " + comparacion2);

        boolean comparacion3 = comparado1 > comparado2;
        boolean comparacion4 = comparado1 < comparado2;

        System.out.println("Entonces el comparado uno es mayor que el dos? " + comparacion3);
        System.out.println("O es menor que el comparado dos? " + comparacion4);

        boolean comparacion5 = comparado1 >= comparado2;
        boolean comparacion6 = comparado1 <= comparado2;

        System.out.println("Intentémoslo con mayor igual, el comparado uno es mayor igual que el 2? " + comparacion5);
        System.out.println("O es menor igual? " + comparacion6);

        System.out.println("Ahora vamos a ver si la persona de la cual la edad está guardada en una variable es mayor de edad o no");

        int edad = 18;

        if (edad>=18) {
            System.out.println("Efectivamente es mayor de edad");
        } else {
            System.out.println("No de hecho no es mayor de edad");
        };


        // --- Operadores lógicos ---       
        // TODO: Implementación en main

        // --- If ---       
        // TODO: Implementación en main

        // --- Switch ---       
        // TODO: Implementación en main

        // --- Otros ejemplos ---       
        // TODO: Implementación en main
        
    }
}

