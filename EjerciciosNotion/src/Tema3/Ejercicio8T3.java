package Tema3;

import java.util.Scanner;

public class Ejercicio8T3 {
    /*
    Desarrolla un programa que pida dos números al usuario y determine cuál es mayor,
    o si son iguales. Muestra el resultado por consola.
     */

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("INTRODUCE EL PRIMER NUMERO");
        int num1 = scanner.nextInt();

        System.out.println("INTRODUCE EL SEGUNDO NUMERO");
        int num2 = scanner.nextInt();

        if (num1>num2){

            System.out.println("EL PRIMER NUMERO INTRODUCIDO (" + num1 + ") es MAYOR que el SEGUNDO NUMERO INTRODUCIDO (" + num2 + ").");
        } else if (num2>num1) {
            System.out.println("EL SEGUNDO NUMERO INTRODUCIDO (" + num2 + ") es MAYOR que el PRIMER NUMERO INTRODUCIDO (" + num1 + ").");

        }
        else{

            System.out.println("LOS NUMEROS SON IGUALES");
        }

        scanner.close();
    }
}
