package metodos;

public class EsDivisible {
    public static boolean esDivisible (int num1, int num2) {

        if (num1%num2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] argv) {
        int num1 = Utilidades.leerEntero("Introduzca un número: ");
        int num2 = Utilidades.leerEntero("Introduzca el divisor: ");

        if (esDivisible(num1, num2)) {
            System.out.println("Es divisible");
        } else {
            System.out.println("No es divisible");
        }

    }
}