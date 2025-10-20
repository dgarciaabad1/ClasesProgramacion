package Tema1;

public class Ejercicio5 {

    public static void main (String[] args){

        //crear programa que use constantes para almacenar info que no cambie
        //y variables para info que puede cambiar y mostrar todos los valores

        final String NOMBREAPP = "La aplicación de David";
        final int ANOPUBLI = 2025;
        double versionactual = 1.0;
        String nombreusuario = "davidgaab";

        System.out.println("Variables finales (no cambian) el nombre de la app y cuando se publicó: ");
        System.out.println(NOMBREAPP);
        System.out.println(ANOPUBLI);
        System.out.println("Variables normales (pueden cambiar) la versión actual y el nombre de usuario:  ");
        System.out.println(versionactual);
        System.out.println(nombreusuario);



    }
}
