package refuerzow3;

import java.util.Scanner;

public class W3_86 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        n = sc.nextInt();

        do {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n*3) +1;
            }
            System.out.println(n);
        } while (n != 1);

        System.out.println("Fin del bucle");

        sc.close();
    }
}