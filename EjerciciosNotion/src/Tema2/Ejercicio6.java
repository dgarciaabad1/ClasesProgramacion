package Tema2;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main (String[] args){

    /*
    Programa que calcule el precio de un producto y porcentaje de descuento
    Calcula precio final después del descuento
    Usa operadores aritméticos y muestra los pasos del cálculo
     */

        System.out.println("Introduce precio producto");
        Scanner sc = new Scanner(System.in);
        int precio = sc.nextInt();

        System.out.println("Introduce porcentaje descuento");
        Scanner sc2 = new Scanner(System.in);
        int descuento = sc2.nextInt();

        int resultado = (precio*descuento)/100;
        int preciofinal = precio-resultado;

        System.out.println("Precio original: " + precio);
        System.out.println("Descuento ("+descuento + "%)" + ": " + resultado + "€");
        System.out.println("Precio final: " + preciofinal);
    }
}
