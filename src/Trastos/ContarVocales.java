package Trastos;

import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        String palabraUsu;
        Scanner sc = new Scanner(System.in);
        int a = 0 , e = 0 , i = 0 , o = 0 , u = 0;

        System.out.println("Introduzca una palabra: ");
        palabraUsu = sc.nextLine();

        for (int ib = 0; ib < palabraUsu.length(); ib++) {

            switch (palabraUsu.charAt(ib)) {
                case 'a': a++; break;
                case 'e': e++; break;
                case 'i': i++; break;
                case 'o': o++; break;
                case 'u': u++; break;
            }

        }

        System.out.println("Hay: " + a + " a " + e + " b " + i + " c " + o + " o " + u + " u");

        sc.close();
    }
}