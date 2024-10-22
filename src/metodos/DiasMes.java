package metodos;

public class DiasMes {
    public static int diasMes (int mes) {

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            default:
                return 30;
        }

    }

    public static void main(String[] argv) {
        int mes = Utilidades.leerEntero("Introduzca el mes: ");

        System.out.println("El mes tiene: " + diasMes(mes));

    }
}