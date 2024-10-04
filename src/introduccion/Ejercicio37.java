package introduccion;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        int numUsuario;
        int decimal = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número binario: ");
        numUsuario = sc.nextInt();
        int numeroDeDigitos = (int) Math.log10(numUsuario) + 1;

        for (int i = 0; i <= numeroDeDigitos; i++) {

            if (numUsuario % 10 == 1) {
                decimal = decimal + (int) Math.pow(2, i);
            }
            numUsuario = numUsuario / 10;

        }
        System.out.println("El número en decimal es: " + decimal);

        sc.close();
    }
}