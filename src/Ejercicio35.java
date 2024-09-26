import java.util.Scanner;
public class Ejercicio35 {
    public static void main(String[] args) {
        int num;
        int num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();

        System.out.print("Ingrese por cuanto quiere dividir: ");
        num2 = sc.nextInt();

        do {
            num = num - num2;
            System.out.println(num);
        } while (num > num2);

        sc.close();
    }
}