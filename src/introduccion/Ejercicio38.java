package introduccion;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio38 {
    public static void main(String[] args) {
        int numUsuario;
        Random rand = new Random(System.currentTimeMillis());
        int secreto = rand.nextInt(100);

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Ingrese un numero: ");
            numUsuario = sc.nextInt();

            if (numUsuario == -1) {
                System.out.println("Te rendiste");
                break;
            }

            if (numUsuario == secreto) {

                System.out.println("Has Ganado");
                break;

            } else if (numUsuario < secreto) {

                System.out.println("El número es más grande");

            } else {

                System.out.println("El número es más pequeño");

            }

        } while (true);

        sc.close();
    }
}