package Tema2;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main (String[] args){

        /* Programa que pida la puntuacion de tres examenes
        calcula la nota media
        usa operadores relacionales para determinar si ha aprobado
        (>=5) aprobado, si tiene notable (>=7),
        y si tiene sobresaliente (>=9). Muestra todos los resultados.
         */

        System.out.println("Introduce la primera nota");
        Scanner sc1 = new Scanner (System.in);
        int nota1 = sc1.nextInt();

        System.out.println("Introduce la segunda nota");
        Scanner sc2 = new Scanner (System.in);
        int nota2 = sc2.nextInt();

        System.out.println("Introduce la tercera nota");
        Scanner sc3 = new Scanner (System.in);
        int nota3 = sc3.nextInt();

        double media = (nota1+nota2+nota3)/3;

        boolean aprobado = media>=5;
        boolean notable = media>=7;
        boolean sobresaliente = media>=9;

        System.out.println("Nota media: " + media);

        System.out.println( "¿Ha aprobado? (>=5): " + aprobado + "\n" +
                            "¿Tiene notable? (>=7) " + notable + "\n" +
                            "¿Tiene sobresaliente? (>=9) " + sobresaliente);
    }
}
