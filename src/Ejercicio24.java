import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        float num;
        float media = 0;
        int dieces = 0;
        int notas = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero: ");
            num = sc.nextFloat();

            if (num != -1){
               notas++;

               media = media + num;

               if (num == 10) {
                   dieces++;
               }
            }

        } while (num != -1);

        System.out.println("Nota media: " + media / notas);
        System.out.println("Dieces totales: " + dieces);

        sc.close();
    }
}