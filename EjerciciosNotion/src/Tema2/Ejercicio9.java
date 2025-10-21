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

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce la primera nota");
        double nota1 = sc.nextInt();

        System.out.println("Introduce la segunda nota");
        double nota2 = sc.nextInt();

        System.out.println("Introduce la tercera nota");
        double nota3 = sc.nextInt();

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
