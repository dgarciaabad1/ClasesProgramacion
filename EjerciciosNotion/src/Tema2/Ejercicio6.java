package Tema2;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main (String[] args){

    /*
    Programa que calcule el precio de un producto y porcentaje de descuento
    Calcula precio final después del descuento
    Usa operadores aritméticos y muestra los pasos del cálculo
     */

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce precio producto");
        int precio = sc.nextInt();

        System.out.println("Introduce porcentaje descuento");
        int descuento = sc.nextInt();

        int resultado = (precio*descuento)/100;
        int preciofinal = precio-resultado;

        System.out.println("Precio original: " + precio);
        System.out.println("Descuento ("+descuento + "%)" + ": " + resultado + "€");
        System.out.println("Precio final: " + preciofinal);
    }
}
