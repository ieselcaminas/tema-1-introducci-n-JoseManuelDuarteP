package metodos;

//Diseña un algoritmo que lea dos valores y muestre el más grande de ellos.
public class MasGrande {
    public static void main(String[] argv) {
        int numero = Utilidades.leerEntero("Introduce un número entero:");
        int numero2 = Utilidades.leerEntero("Introduce otro número entero:");

        // Si las condiciones son mutuamente excluyentes, se usa if .. else
        if (numero > numero2) {
            System.out.println("El número más grande es: " + numero);
        } else {
            System.out.println("El número más grande es: " + numero2);
        }
    }
}