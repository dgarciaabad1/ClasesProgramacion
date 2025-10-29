package Tema3;

import java.util.Scanner;

public class Ejercicio7T3 {

    /*
    Crea un programa que pida una nota numérica (0-10) y determine
    la calificación:
    Suspenso (0-4), Aprobado (5-6), Notable (7-8) o Sobresaliente (9-10).
     */

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("INTRODUCE TU NOTA");
        int nota = scanner.nextInt();

        if (nota<=4){

            System.out.println("SUSPENSO");
        }

        else if (nota>=5&&nota<=6){
            System.out.println("APROBADO");
        }
        else if (nota>=7&&nota<=8){
            System.out.println("NOTABLE");
        }
        else{
            System.out.println("SOBRESALIENTE");
        }

        scanner.close();
    }
}
