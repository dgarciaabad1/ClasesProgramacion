package Tema3;

import java.util.Scanner;

public class Ejercicio3T3 {

    public static void main (String[] args){

        /*
        Escribe un programa que pida la nota de un examen (entre 0 y 10)
         y determine si el alumno ha aprobado (nota mayor o igual a 5) o ha suspendido.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la nota de tu examen");
        int nota = scanner.nextInt();

        if (nota>=5){
            System.out.println("FELICIDADES HAS APROBADO");
        }

        else{
            System.out.println("PUES HAS SUSPENDIDO");
        }

        scanner.close();
    }
}
