package Tema1;

public class Ejercicio9 {

    public static void main (String[] args){

        /*
        Programa que almacene info de un producto
        (nombre, precio, codigo, disponibilidad)
        muestra resultados formateados por consola
         */

        String producto = "Caja cartas One Piece";
        double precio = 109.99;
        String codigo = "BOOSTER-OP13";
        boolean disponible = true;

        System.out.println("INFORMACIÓN DEL PRODUCTO");
        System.out.println("--------------------------");
        System.out.println("Nombre: " + producto);
        System.out.println("Precio: " + precio);
        System.out.println("Código: " + codigo);
        System.out.println("Disponible " + disponible);

    }
}
