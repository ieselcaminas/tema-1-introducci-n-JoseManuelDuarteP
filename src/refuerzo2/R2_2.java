package refuerzo2;

import java.util.Scanner;

public class R2_2 {
    public static void main(String[] args) {
        int dia;
        int mes;
        int diasMes;
        int diasTotal = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um dia: ");
        dia = sc.nextInt();
        System.out.print("Digite um mes: ");
        mes = sc.nextInt();

        for (int i = mes + 1; i <= 12; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    diasMes = 31;
                    break;
                case 2:
                    diasMes = 28;
                    break;
                default:
                    diasMes = 30;
            }
            diasTotal += diasMes;
        }
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = 31;
                break;
            case 2:
                diasMes = 28;
                break;
            default:
                diasMes = 30;
        }

        diasTotal = diasTotal + (diasMes - dia);

        System.out.println(diasTotal);

        sc.close();
    }
}