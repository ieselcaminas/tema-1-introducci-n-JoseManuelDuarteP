import java.util.Scanner;

public class Calc_Dec_Bin {
    public static void main(String[] args) {
        float num;
        String decimal = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        num = sc.nextFloat();

        do {
            num = num * 2;
            if (num >= 1) {
                num = num - 1;
                decimal = decimal + "1";
                System.out.println(decimal);
            } else {
                decimal = decimal + "0";
                System.out.println(decimal);
            }
        } while (num != 0);
        System.out.println("Final: " + decimal);

        sc.close();
    }
}