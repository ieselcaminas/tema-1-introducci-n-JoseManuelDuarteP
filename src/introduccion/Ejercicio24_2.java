package introduccion;

import java.util.Scanner;
public class Ejercicio24_2 {
    public static void main(String[] args) {
        double nota;
        double notaTotal = 0;
        int numNota = 0;
        boolean diez = false;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Introduzca sus notas: ");
            nota = sc.nextInt();

            if (nota != -1) {
                notaTotal += nota;
                numNota++;

                if (nota == 10) {
                    diez = true;
                }

            }

        } while (nota != -1);

        System.out.println("Su nota media es: " + (notaTotal / numNota));
        if (diez) {
            System.out.println("Además, hay un diez");
        } else {
            System.out.println("Además, no hay un diez");
        }
    }
}