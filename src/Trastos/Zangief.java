package Trastos;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Zangief {
    public static void main(String[] args) {
        String accion;
        int vidas = 3;
        int vidas2 = 3;
        Scanner sc = new Scanner(System.in);

        String[] accionZangief = {"Command grab", "Piño", "Cubrirse",};
        Random r = new Random();
        int randomNumber = r.nextInt(accionZangief.length);
        System.out.println(accionZangief[randomNumber]);

        do {

            System.out.println("Zangief te acorrala en la esquina.\nZangief está enfadado.\n¿Que haces?\nOpciones;(DP / putiaso / cubrirse)");
            accion = sc.nextLine();

            if (randomNumber == 0 && Objects.equals(accion, "DP")) {
                System.out.println("Zangief usa " + accionZangief[randomNumber] + "!\nZangief se ve sorprendido por lo random que eres!");
                vidas2--;
                System.out.println("Tienes: " + vidas);
                System.out.println("Zangief tiene: " + vidas2);

            } else if (randomNumber == 0 && Objects.equals(accion, "putiaso")) {
                System.out.println("Zangief usa " + accionZangief[randomNumber] + "!\nZangief se ve sorprendido por lo random que eres!");
                vidas2--;
                System.out.println("Tienes: " + vidas);
                System.out.println("Zangief tiene: " + vidas2);

            } else if (randomNumber == 0 && Objects.equals(accion, "cubrirse")) {
                System.out.println("Zangief usa " + accionZangief[randomNumber] + "!\nTiraste mal la moneda");
                vidas--;
                System.out.println("Tienes: " + vidas);
                System.out.println("Zangief tiene: " + vidas2);

            } else if (randomNumber == 1 && Objects.equals(accion, "DP")) {
                System.out.println("Zangief usa " + accionZangief[randomNumber] + "!\nZangief se ve sorprendido por lo random que eres!");
                vidas2--;
                System.out.println("Tienes: " + vidas);
                System.out.println("Zangief tiene: " + vidas2);

            } else if (randomNumber == 1 && Objects.equals(accion, "putiaso")) {
                System.out.println("Zangief usa " + accionZangief[randomNumber] + "!\nTiraste mal la moneda");
                vidas--;
                System.out.println("Tienes: " + vidas);
                System.out.println("Zangief tiene: " + vidas2);

            } else if (randomNumber == 1 && Objects.equals(accion, "cubrirse")) {
                System.out.println("Zangief usa " + accionZangief[randomNumber] + "!\nEmpate. El neutro continua");
                System.out.println("Tienes: " + vidas);
                System.out.println("Zangief tiene: " + vidas2);

            } else if (randomNumber == 2 && Objects.equals(accion, "DP")) {
                System.out.println("Zangief usa " + accionZangief[randomNumber] + "!\nTiraste mal la moneda");
                vidas--;
                System.out.println("Tienes: " + vidas);
                System.out.println("Zangief tiene: " + vidas2);

            } else if (randomNumber == 2 && Objects.equals(accion, "putiaso")) {
                System.out.println("Zangief usa " + accionZangief[randomNumber] + "!\nEmpate. El neutro continua");
                System.out.println("Tienes: " + vidas);
                System.out.println("Zangief tiene: " + vidas2);

            } else if (randomNumber == 2 && Objects.equals(accion, "cubrirse")) {
                System.out.println("Zangief usa " + accionZangief[randomNumber] + "!\nEmpate. Os mirais a los ojos tiernamente");
                System.out.println("Tienes: " + vidas);
                System.out.println("Zangief tiene: " + vidas2);

            } else {
                System.out.println("Opcion no valida.\nAprende a escribir que la vida te va ha comer.");
            }

        }while (vidas != 0 && vidas2 != 0);

        if (vidas == 0) {
            System.out.println("Has perdido, espabila");
        } else if (vidas2 == 0) {
            System.out.println("Has ganado. GG supongo...");
        }

    }
}