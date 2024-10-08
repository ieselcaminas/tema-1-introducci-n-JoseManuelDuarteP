package introduccion;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        String palabrasUsuario;
        boolean check = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase: ");
        palabrasUsuario = sc.nextLine();

        String palabrasSinEspacios = palabrasUsuario.replaceAll("\\s+", "").toLowerCase();
        int numLetras = palabrasSinEspacios.length();

        for (int i = 0; i < (numLetras/2); i++) {

            if (palabrasSinEspacios.charAt(i) != palabrasSinEspacios.charAt(numLetras-i-1)) {

                check = false;
                break;

            }

        }

        if (check) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }

        sc.close();
    }
}