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
   
        
        int suma = num1 + num4;

        System.out.println("La suma da " + suma);

        if (booleano) {
            System.out.println("El booleano en este momento es true");
        } else {
            System.out.println("En este momento el booleano es false");
        }

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
        x %= 5;  // ahora x = 1

        System.out.println("Valor final de x: " + x);

        // --- Operadores de comparación ---       
        // TODO: Implementación en main

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

