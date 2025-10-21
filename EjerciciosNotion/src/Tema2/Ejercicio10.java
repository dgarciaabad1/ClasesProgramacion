package Tema2;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main (String[] args){

        /*
        programa que pida:
        salario base por hora, horas trabajadas, horas extra (booleano)

        si ha hecho horas extra y trabajó más de 40 horas:
        las horas que excedan de 40 se pagan el doble

        usa operadores logicos, relacionales y aritmeticos para calcular salario total

         */

        System.out.println("Introduce salario por hora");
        Scanner sc = new Scanner (System.in);
        int salario = sc.nextInt();

        System.out.println("Introduce las horas trabajadas");
        int horas = sc.nextInt();

        System.out.println("¿Has hecho horas extras?");
        boolean extras = sc.nextBoolean();

        boolean horasnormales = horas<=40;
        boolean horasexcede = horas>40;
        boolean aplicaExtras = extras && horas > 40;
        int salariohorasnormal = horas*salario;

        System.out.println("Horas normales (máximo de 40): ");
        System.out.println("Horas extra: ");
        //esta parte queda pendiente porque no sé como separar los números sin usar
        //condicionales o ternarios

        System.out.println("¿Trabajaste más de 40 horas? " + horasexcede);
        System.out.println("Tienes derecho a horas extra?" + horasexcede);
        System.out.println("¿Se aplican horas extra? (>40 AND permitido) " + aplicaExtras);
        System.out.println("Salario por horas normales: " + salariohorasnormal);

        //lo de abajo queda medio pendiente por lo mismo
        System.out.println("Salario por horas extra (doble): " + "PDTE, NO SÉ SEPARAR LOS DOS NÚMEROS");
        System.out.println("Salario total: " + "PDTE, NO SÉ SEPARAR LOS DOS NÚMEROS");






    }
}
