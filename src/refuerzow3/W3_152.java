package refuerzow3;

import java.util.Scanner;
public class W3_152 {
    public static void main(String[] args) {
        int num;
        int num2;
        int num3;
        int num4;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer numero");
        num = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        num2 = sc.nextInt();
        System.out.println("Introduzca el tercer numero");
        num3 = sc.nextInt();
        System.out.println("Introduzca el quarto numero");
        num4 = sc.nextInt();

        if (num == num2 && num == num3 && num == num4) {
            System.out.println("Todos son iguales");
        } else {
            System.out.println("No son iguales");
        }

        sc.close();
    }
}