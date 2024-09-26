package refuerzow3;

import java.util.Scanner;
public class W3_153 {
    public static void main(String[] args) {
        double num;
        double num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer numero");
        num = sc.nextDouble();
        System.out.println("Introduzca el segundo numero");
        num2 = sc.nextDouble();

        if (num >= 0 && num <= 1 && num2 >= 0 && num2 <= 1) {
            System.out.println("Están entre 0 y 1");
        } else {
            System.out.println("No están entre 0 y 1");
        }

        sc.close();
    }
}