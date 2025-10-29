package Tema3;

import java.util.Scanner;

public class Ejercicio6T3 {

    /*
    Programa que pida EDAD USUARIO y determina si puede acceder a contenido para mayor 16 años
    SI TIENE 16 AÑOS O MAS muestra: ACCESO PERMITIDO
    SI NO: muestra: ACCESO DENEGADO
     */

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("ESCRIBE TU EDAD PIMPOLLO");
        int edad = scanner.nextInt();

        if (edad>=16){

            System.out.println("ACCESO PERMITIDO");
        }
        else {
            System.out.println("ACCESO DENEGADO");
        }

        scanner.close();

    }
}
