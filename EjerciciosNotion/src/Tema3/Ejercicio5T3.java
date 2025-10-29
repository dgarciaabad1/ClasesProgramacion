package Tema3;

import java.util.Scanner;

public class Ejercicio5T3 {

    /*
    Desarrolla un programa que pida un número entero y determine si es par o impar
    usando el operador módulo. Muestra un mensaje personalizado para cada caso.
     */

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num1 = scanner.nextInt();

        if ((num1%2)==0){

            System.out.println("EL NUMERO ES PAR");

        }
        else{

            System.out.println("EL NUMERO ES IMPAR");
        }


        scanner.close();



    }
}
