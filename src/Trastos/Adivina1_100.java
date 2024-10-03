package Trastos;

import java.util.Scanner;
import java.util.Random;

public class Adivina1_100 {
    public static void main(String[] args) {
        int numUsuario;
        int intentos = 0;
        Random rand = new Random();
        int numRandom = rand.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Ingrese un número: ");
            numUsuario = sc.nextInt();

            if (numUsuario == numRandom) {

                intentos++;

            } else if (numUsuario > numRandom) {

                intentos++;
                System.out.println("El número es menor!");

            } else {

                intentos++;
                System.out.println("El número es mayor!");

            }

        } while (numUsuario != numRandom);
        System.out.println("El número era " + numRandom + " y le ha costado " + intentos + " intentos");

        sc.close();
    }
}