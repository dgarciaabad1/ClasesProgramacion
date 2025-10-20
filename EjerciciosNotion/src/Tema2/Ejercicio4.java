package Tema2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main (String[] args){

        //programa que pida numero al usuario y determine
        //si es par o impar usando el operador modulo
        //mostrar por consola


        System.out.println("Introduce un número");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        int operacion = num1%2;


        System.out.println("El número " + num1 + " tiene un resto de " + operacion );
        System.out.println("Si tiene un resto de 0 es par, si tiene un resto de 1 es impar.");

    }
}
