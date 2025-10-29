package Tema3;

import java.util.Scanner;

public class Ejercicio10T3 {
    /*
    PROGRAMA QUE PIDA ALTURA USUARIO EN CM
    DETERMINA SI PUEDE O NO SUBIR A UNA ATRACCIÓN
    ALTURA MINIMA 120CM
    MAXIMA 200CM

    SI ESTA DENTRO DEL RANGO: PUEDES SUBIR
    SI NO: DEMASIADO ALTO/BAJO
     */

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("INTRODUCE TU ALTURA EN CM SIN DECIMALES");
        int altura = scanner.nextInt();

        if (altura<120){
            System.out.println("NO PUEDES SUBIR, DEMASIADO BAJO");
        }
        else if (altura>200){
            System.out.println("NO PUEDES SUBIR, DEMASIADO ALTO");
        }
        else{
            System.out.println("PUEDES SUBIR SIN PROBLEMA");
        }

        scanner.close();
    }
}
