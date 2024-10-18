package introduccion;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        int numUsuario;
        String binario = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        numUsuario = sc.nextInt();

        do {

            if (numUsuario % 2 == 0) {
                binario = binario + "0";
                System.out.println(binario);
            } else {
                binario = binario + "1";
                System.out.println(binario);
            }
            numUsuario = numUsuario / 2;

        } while (numUsuario > 1);

        if (numUsuario == 1) {
            binario = binario + "1";
        } else {
            binario = binario + "0";
        }

        String binarioFin = new StringBuilder(binario).reverse().toString();
        System.out.println("Número convertido: " + binarioFin);

        sc.close();
    }
}