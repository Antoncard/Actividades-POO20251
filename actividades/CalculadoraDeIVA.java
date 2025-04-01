
public class CalculadoraDeIVA {
    public static void main(String[] args) {
      //Variables
      double BasedeCompras = 125000; // valor de la compra
      double tasaIVA = 0.19; //19% de iva
      double montoIVA;
      double total;

      //operaciones
        montoIVA = BasedeCompras * tasaIVA;
        total = BasedeCompras + montoIVA;

        //consola
        System.out.println("El total de la compra sin iva es: " + BasedeCompras);
        System.out.println("El IVA que se le aplicara a tu compra es: " + (tasaIVA*100)+ "%");
        System.out.println("El monto con iva calculado es: " + montoIVA);
        System.out.println("El total de la compra con IVA es: " + total);





    }
}