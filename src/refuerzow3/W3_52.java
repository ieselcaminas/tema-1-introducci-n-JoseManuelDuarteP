package refuerzow3;

import java.util.Scanner;
public class W3_52 {
    public static void main(String[] args) {
        int num;
        int num2;
        int num3;
        boolean comprobacion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 1er numero de suma: ");
        num = sc.nextInt();
        System.out.println("Ingrese 2do numero de suma: ");
        num2 = sc.nextInt();
        System.out.println("Ingrese numero de igualdad: ");
        num3 = sc.nextInt();

        comprobacion = num + num2 == num3;
        System.out.println("Resultado es: " + comprobacion);

        sc.close();
    }
}