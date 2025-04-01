
public class AntonioCardonaConversionDeMoneda {
    public static void main (String[] args) {

        double cantidadPesos = 150000; // COP
        double tasaCambio = 3895;      // Tasa de cambio: 1 USD = 3895 COP
        double cantidadDolares;

        cantidadDolares = cantidadPesos / tasaCambio;

        System.out.println("Cantidad en pesos colombianos: $" + cantidadPesos);
        System.out.println("Tasa de cambio (1 USD = $" + tasaCambio + " COP)");
        System.out.println("Cantidad equivalente en dólares estadounidenses: $" + (cantidadDolares));








    }
}