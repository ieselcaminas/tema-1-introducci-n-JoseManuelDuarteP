package introduccion;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        int num;
        boolean primo = true;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();

        if (num == 2) {
            primo = true;
        }else {
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    primo = false;
                    break;
                }

            }
        }
        if (primo) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }

        sc.close();
    }
}