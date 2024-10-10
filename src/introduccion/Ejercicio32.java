package introduccion;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        int num = 0;
        int num2 = 1;
        int num3 = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i <= 40 ; i++) {
            System.out.println(num3);
            num3 = num + num2;
            num = num2;
            num2 = num3;
        }

        sc.close();
    }
}