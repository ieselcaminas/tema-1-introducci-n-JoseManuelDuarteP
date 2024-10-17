package Trastos;

import java.util.Scanner;

public class LetrasPalabras {
    public static void main(String[] args) {
        String palabraUsu;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la palabra: ");
        palabraUsu = sc.nextLine();

        int largoPalabra = palabraUsu.length();

        for (int i = 0; i < largoPalabra; i++) {

            System.out.println("La letra '" + palabraUsu.charAt(i) + "' está en la posición " + (i + 1));

        }

        sc.close();
    }
}