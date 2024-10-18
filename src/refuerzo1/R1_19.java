package refuerzo1;

import java.util.Scanner;

public class R1_19 {
    public static void main(String[] args) {
        double km;
        double metros;
        double segundos;
        double velocidad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite el valor de distancia entra radares: ");
        metros = sc.nextDouble();
        System.out.print("Digite el valor de velocidad máxima: ");
        km = sc.nextDouble();
        System.out.print("Digite el tiempo del intervalo: ");
        segundos = sc.nextDouble();

        metros = metros / 1000;
        segundos = segundos / 3600;
        velocidad = metros / segundos;

        if (velocidad > km) {
            System.out.println("Multa");
        } else {
            System.out.println("to bien");
        }

        sc.close();
    }
}