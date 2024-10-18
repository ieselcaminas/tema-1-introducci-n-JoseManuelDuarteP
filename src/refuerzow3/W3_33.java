package refuerzow3;

import java.util.Scanner;
public class W3_33 {
    public static void main(String[] args) {
        int num;
        int operador;
        int suma = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese número: ");
        num = sc.nextInt();

        do {
            operador = num % 10;
            suma += operador;
            num = num / 10;
        } while (num != 0);

        System.out.println("La suma de los carácteres es: " + suma);

        sc.close();
    }
}