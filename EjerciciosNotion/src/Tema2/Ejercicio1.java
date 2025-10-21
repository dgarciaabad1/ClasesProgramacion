package Tema2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main (String[] args){

        /*
        programa que pida al usuario dos numeros enteros por consola
        muestre el resultado de las cinco operaciones basicas
        (suma, resta, mult, div y modulo resto
         */

        System.out.println("Introduce numero 1.");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Introduce numero 2.");
        int num2 = sc.nextInt();

        System.out.println("Los numeros que has escogido son:");
        System.out.println("NUMERO 1: " + num1);
        System.out.println("NUMERO 2: " + num2);
        System.out.println("RESULTADO SUMA " + (num1+num2));
        System.out.println("RESULTADO RESTA " + (num1-num2));
        System.out.println("RESULTADO DIVISION " + (num1/num2));
        System.out.println("RESULTADO MULTIPLICACION " + (num1*num2));
        System.out.println("RESULTADO MODULO RESTO " + (num1%num2));


    }
}
