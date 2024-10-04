package refuerzo1;

import java.util.Scanner;

public class R1_20 {
    public static void main(String[] args) {
        int hojas;
        Scanner sc = new Scanner(System.in);

        System.out.print("Hojas: ");
        hojas = sc.nextInt();

        if (hojas < 3) {
            System.out.println("IMPOSIBLE");
        } else {
            System.out.println("Hay " + (hojas / 4) + " posible con 4");
        }

        sc.close();
    }
}