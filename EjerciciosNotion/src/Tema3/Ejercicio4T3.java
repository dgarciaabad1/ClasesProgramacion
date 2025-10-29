package Tema3;

import java.util.Scanner;

public class Ejercicio4T3 {

    /*
    Crea un programa que pida el importe de una compra.
    Si el importe es mayor o igual a 100€, aplica un descuento del 10%. Muestra el importe original y el importe final a pagar.
     */

    public static void main (String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el importe de tu compra");

        int compra = scanner.nextInt();
        int conDescuento = (int)(compra-(compra*0.10));

        if(compra>=100){

            System.out.printf("Tu compra original era de: %d \nNo obstante con el descuento se te queda en %d", compra, conDescuento);
        }

        else{

            System.out.println("Tu compra es de: " + compra + "€ pero al ser un importe menor a 100€ no tienes descuento alguno");
        }


        scanner.close();
    }
}
