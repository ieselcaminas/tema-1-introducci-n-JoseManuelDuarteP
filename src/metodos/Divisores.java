package metodos;

public class Divisores {
    public static String esDivisor (int num) {
        String divisores = "";

        for (int i = 1 ; i <= num; i++) {
            if (num % i == 0) {
                divisores += (i + " ");
            }
        }
        return divisores;
    }

    public static void main(String[] argv) {
        int num = Utilidades.leerEntero("Introduzca un número natural: ");

        System.out.println("Los divisores son: " + esDivisor(num));

    }
}