package refuerzo1;

import java.util.Scanner;

public class R1_18 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            for (int i = n; i <= (n + 10); i += 2) {
                    System.out.println(i);
            }
        } else {
            for (int i = n; i <= (n + 10); i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}