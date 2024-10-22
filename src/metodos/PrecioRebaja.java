package metodos;

public class PrecioRebaja {
    public static double descuento (double precio, double precioR) {
        double descuento;
        descuento = (precio - precioR)/precio*100;
        return descuento;

    }

    public static void main(String[] argv) {
        double precio = Utilidades.leerDoble("Introduzca el precio: ");
        double precioR = Utilidades.leerDoble("Introduzca el precio con descuento: ");

        System.out.println("El duescuento es de: " + descuento(precio, precioR) + "%");

    }
}