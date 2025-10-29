package Tema3;

import java.util.Scanner;

public class Ejercicio2T3 {

    public static void main (String[] args){

        /*
        Desarrolla un programa que pida un número al usuario y determine
        si es positivo, negativo o cero. Muestra el resultado por consola.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número, te diré si es positivo, negativo o cero");
        int numero = scanner.nextInt();

        if (numero==0){
            System.out.println("EL NUMERO ES 0");
        }
        if (numero>0){
            System.out.println("EL NUMERO ES POSITIVO");
        }
        if (numero<0){
            System.out.println("EL NUMERO ES NEGATIVO");
        }

    }
}
