package introduccion;

import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args) {
        long factorial = 1;
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial del numero " + num + " es " + factorial);

        sc.close();
    }
}