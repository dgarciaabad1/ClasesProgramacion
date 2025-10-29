package Tema3;

import java.util.Scanner;

public class Ejercicio11T3 {

    /*
    PROGRAMA QUE PIDA IMPORTE DE UNA COMPRA
    Y SI EL CLIENTE ES SOCIO (TRUE O FALSE)

    APLICA DESCUENTOS SEGUN ESTAS REGLAS:
    SI ERES SOCIO Y LA COMPRA ES MAYOR O IGUAL A 200, UN 20%
    SI ES SOCIO Y LA COMPRA ES MENOR DE 200, UN 10%
    SI NO ES SOCIO PERO LA COMPRA ES MAYOR O IGUAL A 300, DESCUENTA 5%
    CUALQUIER ORTO CASO NO HAY DESCUENTO
    MUESTRA IMPORTE ORIGINAL, DESCUENTO APLICADO E IMPORTE FINAL
     */

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("INTRODUCE IMPORTE DE TU COMPRA");
        int compra = scanner.nextInt();

        System.out.println("INDICA SI ERES SOCIO (true/false)");
        boolean socio = scanner.nextBoolean();

        if (compra>=200 && socio==true){

            int descuento = (int)(compra-(compra*0.20));

            System.out.println("IMPORTE ORIGINAL: " + compra);
            System.out.println("DESCUENTO APLICADO: 20% ");
            System.out.println("IMPORTE FINAL: " + descuento);

        }
        else if (compra<200 && socio==true){

            int descuento = (int)(compra-(compra*0.10));

            System.out.println("IMPORTE ORIGINAL: " + compra);
            System.out.println("DESCUENTO APLICADO: 10% ");
            System.out.println("IMPORTE FINAL: " + descuento);

        }
        else if (compra>=300 && socio==false){

            int descuento = (int)(compra-(compra*0.05));

            System.out.println("IMPORTE ORIGINAL: " + compra);
            System.out.println("DESCUENTO APLICADO: 5% ");
            System.out.println("IMPORTE FINAL: " + descuento);

        }
        else{

            System.out.println("IMPORTE ORIGINAL: " + compra);
            System.out.println("DESCUENTO APLICADO: 0% ");
            System.out.println("IMPORTE FINAL: " + compra);

        }

        scanner.close();
    }
}


