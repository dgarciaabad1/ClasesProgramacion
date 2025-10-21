package Tema2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main (String[] args){

        /*
        programa que pida edad usuario y si tiene carnet conducir (true o false)
        usa operadores logicos para determinar si puede alquilar un coche
        tiene que tener 21 años o mas y tener carnet
        && (Y lógico)
        || (OR lógico)
        ! (Lógico NO)
         */

        System.out.println("Introduce tu edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        //esto pide la edad y la guarda en una variable de entero

        System.out.println("¿Tienes carnet de conducir?");
        boolean carnet = sc.nextBoolean();
        //esto pide si tiene carnet y la guarda en una variable de booleano

        boolean edadtotal = edad>=21;
        //esto comprueba si la edad es igual o mayor a 21 años


        System.out.println("¿Eres mayor de 21 años?: " + edadtotal);
        System.out.println("¿Tienes carnet?: " + carnet);
        System.out.println("¿Puedes alquilar un coche? " + (edadtotal&&carnet));
        //esta última línea utiliza el AND (&&) para comprobar que ambos valores son true
        // de ser así te devuelve true, es decir, tiene lo necesario para alquilar coche

    }
}
