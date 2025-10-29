package Tema3;

import java.util.Scanner;

public class Ejercicio1T3 {

    public static void main (String[] args){

        /*
        Crea un programa que pida la edad del usuario y determine si es mayor de edad
        (18 años o más). Muestra un mensaje indicando si puede votar o no.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad");

        int edad = scanner.nextInt();

        if (edad>=18){

            System.out.println("Puedes votar");
        }

        else{
            System.out.println("NO puedes votar");
        }


    }
}
