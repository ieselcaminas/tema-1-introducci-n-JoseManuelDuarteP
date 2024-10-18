package Trastos;

import java.util.Scanner;

public class Basura {
    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese una palabra
        System.out.println("Introduce una palabra: ");
        String palabraUsu = sc.nextLine();

        // Convertir la palabra a minúsculas para evitar diferencias por mayúsculas
        palabraUsu = palabraUsu.toLowerCase();

        // Recorrer cada letra del alfabeto (de 'a' a 'z')
        for (char letra = 'a'; letra <= 'z'; letra++) {
            int contador = 0;

            // Recorrer la palabra para contar cuántas veces aparece la letra
            for (int i = 0; i < palabraUsu.length(); i++) {
                if (palabraUsu.charAt(i) == letra) {
                    contador++;
                }
            }

            // Si la letra aparece al menos una vez, imprimir el resultado
            if (contador > 0) {
                System.out.println("La letra '" + letra + "' aparece " + contador + " vez/veces.");
            }
        }

        // Cerrar el Scanner
        sc.close();
    }
}