package Trastos;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        int numIntro;
        int numSuma = 0;
        int numCant = 0;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Introduzca numeros para hacer media (-1 para parar): ");
            numIntro = sc.nextInt();

            if (numIntro == -1) {
                break;
            } else {
                numSuma += numIntro;
                numCant++;
            }

        } while (true);

        System.out.println("El promedio es: " + numSuma / numCant);

        sc.close();
    }
}