package Tema2;

import java.util.Scanner;

public class Ejercicio8 {

    static void main (String[] args){

    /*
    Programa que pida tres numeros al usuario y calcule la suma de los tres
    LA SUMA / EL PROMEDIO / RESULTADO MULTIPLICCAR PRIMERO POR SEGUNDO Y DIVIDIRLO POR EL TERCERO
     */

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();

        System.out.println("Introduce el tercer numero");
        int num3 = sc.nextInt();

        int total = (num1+num2+num3);
        System.out.println("Suma de los tres numeros: " + total);
        //suma total de los 3 numeros

        int promedio = ((num1+num2+num3)/3);
        //aqui tambien se podria haber hecho int promedio = total/3; pero el ejercicio pide que se usen paréntesis
        System.out.println("Promedio: " + promedio);
        //calcular promedio

        int operacion = ((num1*num2)/num3);
        System.out.println("Resultado de (" + num1 + " * " + num2 + ") / " + num3 + ": " + operacion);

    }
}
