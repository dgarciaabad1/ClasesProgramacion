package Tema2;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main (String[] args){

        /*
        Programa que pida al usuario su edad y si es estudiante (true o false)
        usa operadores lógicos AND,OR,NOT para determinar si puede acceder
        a diferentes descuentos: DESCUENTO JOVEN (MENOR 26 AÑOS) /
        DESCUENTO ESTUDIANTE / DESCUENTO ESPECIAL (MENOR 26 + ESTUDIANTE)
         */

        System.out.println("Introduce tu edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        System.out.println("¿Eres estudiante?");
        Scanner sc2 = new Scanner(System.in);
        boolean estudiante = sc2.nextBoolean();


        System.out.println("Eres estudiante: " + estudiante);
        System.out.println("NO eres estudiante: " + (!estudiante));
        System.out.println("Tienes descuento joven: " + (edad<=26));
        System.out.println("Tienes descuento de estudiante: " + estudiante);
        System.out.println("Tienes descuento especial:" + (estudiante&&(edad<=26)));

    }
}
