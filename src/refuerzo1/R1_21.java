package refuerzo1;

import java.util.Scanner;

public class R1_21 {
    public static void main(String[] args) {
        double saldo;
        double gastos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo do seu conte: ");
        saldo = sc.nextDouble();
        System.out.println("Digite o gastos do seu conte: ");
        gastos = sc.nextDouble();

        if ((saldo + gastos) >= 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}