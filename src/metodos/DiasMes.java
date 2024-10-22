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
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }

    }

    public static void main(String[] argv) {
        int mes = Utilidades.leerEntero("Introduzca el mes: ");

        if (diasMes(mes) == -1) {
            System.out.println("El mes de no existe");
        } else {
            System.out.println("El mes tiene: " + diasMes(mes));
        }

    }
}