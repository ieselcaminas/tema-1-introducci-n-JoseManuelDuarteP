package metodos;

//Diseña un algoritmo que lea un valor numérico
//entero correspondiente a la nota de un examen y muestre su valor en letra
public class ValorNotaMain {
    public static String valorEnLetra(int nota) {
        if ((nota < 0) || (nota > 10)) {
            return "Nota inválida";
        }else if (nota < 3) {
            return "Muy deficiente";
        }else if (nota < 5 ) {
            return "Insuficiente";
        }else if (nota < 6 ) {
            return "Suficiente";
        }else if (nota < 7 ) {
            return "bien";
        }else if (nota < 9 ) {
            return "notable";
        }else {
            return "sobresaliente";
        }
    }
    public static void main(String argv[]) {

        int nota = Utilidades.leerEntero("Introduce el valor de la nota entera:");
        String valor = valorEnLetra(nota);
        System.out.println(valor);

    }
}