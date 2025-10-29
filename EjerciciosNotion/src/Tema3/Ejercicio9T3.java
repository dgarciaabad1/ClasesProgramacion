package Tema3;

import java.util.Scanner;

public class Ejercicio9T3 {

    /*
    Escribe un programa que pida el peso (en kg) y la altura (en metros) del usuario
    Calcula el IMC (peso / altura²) y determina si está en peso normal (IMC entre 18.5 y 24.9)
    por debajo del peso normal (IMC menor a 18.5)
     o por encima del peso normal (IMC mayor a 24.9).
     */

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("INTRODUCE TU PESO, como en este ejemplo: '70,0'");
        double peso = scanner.nextDouble();

        System.out.println("INTRODUCE TU ALTURA, como en este ejemplo: '1,85'");
        double altura = scanner.nextDouble();

        double imc = (peso/(altura*altura));

        if (imc<=18.5){

            System.out.println("ESTAS POR DEBAJO DEL PESO NORMAL, TU IMC ES DE " + imc);
        }
        else if (imc>=18.5 && imc<=24.9){

            System.out.println("ESTAS EN UN PESO NORMAL, TU IMC ES DE" + imc);
        }
        else{

            System.out.println("ESTAS POR ENCIMA DEL PESO NORMAL, TU IMC ES DE " + imc);
        }

        scanner.close();
    }
}
