import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String[] args) {
        int num;
        int num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();

        System.out.print("Ingrese las veces que quiere multiplicar: ");
        num2 = sc.nextInt();

        for (int i = 1 ; i <= num2 ; i++) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print(num + " + ");
            }
            System.out.println(" = " + num*i);
        }

        sc.close();
    }
}