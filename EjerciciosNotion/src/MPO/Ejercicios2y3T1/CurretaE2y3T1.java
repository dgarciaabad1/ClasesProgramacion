package MPO.Ejercicios2y3T1;

import java.util.Scanner;

public class CurretaE2y3T1 {

    Scanner sc = new Scanner(System.in);

    public void Ejercicio2(){

           /*
        EJERCICIO 2:
        Permítase introducir el valor con IVA de una compra con dos decimales (la
        compra no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA de dicha
        compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA?¿Cuánto fue
        el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra)
         */

        System.out.println("Introduce importe compra (entre 0 y 500)");
        double compra = sc.nextDouble();
        if (compra>500 || compra<0){
            System.out.println("Error porque eres melón y tenía que ser entre 0 y 500");
            return;
        }

        System.out.println("Introduce valor IVA");
        double porcentajeIva = sc.nextDouble();

        double importeIva = (compra*porcentajeIva)/100;
        double valorCompra = (compra-importeIva);

        System.out.printf("Valor compra (entre 0 y 500€: %.2f%n", valorCompra);
        System.out.printf("Importe IVA: %.2f%n", importeIva);

    }

    public void Ejercicio3(){

        /*
        Ejercicio 3
        Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil,
        centenas, decenas y unidades), y se obtiene el número correspondiente.
         */

        System.out.println("Introduzca un número de 5 dígitos o menos para el desglose");
        int cifra = sc.nextInt();
            if (cifra>99999||cifra<0){
                System.out.println("ERROR PORQUE El número tiene que ser de 5 dígitos o menos");
                return;
        }
        else {
            int decenasmil = cifra/10000;
            int unidadesmil = (cifra/1000)%10;
            int centenas = (cifra/100)%10;
            int decenas = (cifra/10)%10;
            int unidades = cifra%10;

            System.out.println("La cifra escogida es: " + cifra);
            System.out.println("Decenas de mil: " + decenasmil);
            System.out.println("Unidades de mil: " + unidadesmil);
            System.out.println("Centenas: " + centenas);
            System.out.println("Decenas: " + decenas);
            System.out.println("Unidades: " + unidades);
        }



    }


}
