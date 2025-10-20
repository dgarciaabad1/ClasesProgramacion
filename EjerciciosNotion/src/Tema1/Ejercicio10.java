package Tema1;

public class Ejercicio10 {

    public static void main (String[] args){

       /*
       Programa que convierta una temperatura de grados Celsius a Fahrenheit
       Usa una variable para Celsius y mostrar resultado conversión

       FORMULA: F = C x 9/5 + 32

        */

        double celsius = 32.0;
        double resultado = (((celsius * 9)/5)+32);

        System.out.println("Temperatura en Celsius " + celsius);
        System.out.println("Temperatura en Fahrenheit " + resultado);
    }
}
