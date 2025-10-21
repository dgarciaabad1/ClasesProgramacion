package Tema2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main (String[] args){

        /*
        programa que pida dos numeros al usuario y muestre resultado
        de las comparaciones relacionales entre ellos
        (mayor que, menor que, igual, diferente, mayor o igual, menor o igual)
         */

        System.out.println("Introduce numero 1.");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Introduce numero 2.");
        int num2 = sc.nextInt();

        boolean mayor = num1>num2;
        boolean menor = num1<num2;
        boolean igual = num1==num2;
        boolean diferente = num1!=num2;
        boolean mayoroigual = num1>=num2;
        boolean menoroigual = num1<=num2;


        System.out.println("¿" + num1 + " es mayor que " + num2 + "?: " + mayor);
        System.out.println("¿" + num1 + " es menor que " + num2 + "?: " + menor);
        System.out.println("¿" + num1 + " es igual que " + num2 + "?: " + igual);
        System.out.println("¿" + num1 + " es diferente que " + num2 + "?: " + diferente);
        System.out.println("¿" + num1 + " es mayor o igual que " + num2 + "?: " + mayoroigual);
        System.out.println("¿" + num1 + " es menor o igual que " + num2 + "?: " + menoroigual);
    }
}
