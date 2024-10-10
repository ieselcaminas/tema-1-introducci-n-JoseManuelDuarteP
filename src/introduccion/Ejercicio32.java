package introduccion;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        double num = 0;
        double num2 = 1;
        double num3;
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i <= 40 ; i++) {
            num3 = num + num2;
            num = num2;
            num2 = num3;
            System.out.println(num3);
        }

        sc.close();
    }
}