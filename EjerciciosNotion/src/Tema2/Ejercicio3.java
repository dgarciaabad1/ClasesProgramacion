package Tema2;

public class Ejercicio3 {

    public static void main (String[] args){

        /*
        Programa que declare variable con valor inicial 100 y aplique
        diferentes operadores de asignación compuesta
        (+= , -= , *= , /=)
         Mostrar valor variable después de cada operación
         */

        int num1 = 100;
        //Variable declarada
        System.out.println("Valor inicial: " + num1);

        num1 += 10;
        System.out.println("Después de sumar 10: " + num1);

        num1 -= 20;
        System.out.println("Después de restar 20: " + num1);

        num1 *= 2;
        System.out.println("Después de multiplicar por 2: " + num1);

        num1 /= 3;
        System.out.println("Después de dividir entre 3: " + num1);

    }
}
