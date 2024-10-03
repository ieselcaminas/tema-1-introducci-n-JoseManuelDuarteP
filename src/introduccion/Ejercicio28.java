package introduccion;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();

        if (num % 2 != 0 || num == 2) {

            for (int i = 1; i <= num; i++) {

                if (i % 2 != 0 && num / i == 0) {
                    System.out.println("El número no es primo");
                    break;
                } else if (i % 2 != 0 && num / i == 1) {
                    System.out.println("El número es primo");
                }

            }

        } else {
            System.out.print("El numero no es primo");
        }

        sc.close();
    }
}