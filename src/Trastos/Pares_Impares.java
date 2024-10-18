package Trastos;

import java.util.Scanner;

public class Pares_Impares {
    public static void main(String[] args) {
        int numeroUsuario;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número mayor a 1: ");
        numeroUsuario = sc.nextInt();

        for (int i = 1; i <= numeroUsuario; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }

        }

        sc.close();
    }
}