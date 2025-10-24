package MPO;

public class EntradaPruebaCalculadora {

    public static void main(String[] args) {


        System.out.println();
        System.out.println("Vamos a probar la calculadora que está en otra pestañita, es un método (no main) que se llama desde el main");

        Calculadora calculadoramates = new Calculadora();

        calculadoramates.sumar(4, 5);
        calculadoramates.restar(10,6);
        calculadoramates.multiplicar(5,5);
        calculadoramates.dividir(100,5);
    }
}