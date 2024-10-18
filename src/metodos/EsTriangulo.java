package metodos;

public class EsTriangulo {
    public static boolean esTriangulo (int num1, int num2, int num3) {

        if (num1 + num2 < num3) {
            return false;
        } else if (num1 + num3 < num2) {
            return false;
        } else if (num2 + num3 < num1) {
            return false;
        } else {
            return true;
        }

    }

    public static void main(String[] argv) {
        int num1 = Utilidades.leerEntero("Introduzca un número: ");
        int num2 = Utilidades.leerEntero("Introduzca otro número: ");
        int num3 = Utilidades.leerEntero("Introduzca otro número: ");

        if (esTriangulo(num1, num2, num3)) {
            System.out.println("Es un triangulo posible");
        } else {
            System.out.println("Es un triangulo imposible");
        }

    }
}