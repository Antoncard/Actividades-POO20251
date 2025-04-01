import java.util.Scanner;

public class PromedioPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        double sumadepositivos = 0;
        int contadordepositivos = 0;
        double promedio;

        do {
            System.out.print("Ingrese un número positivo (o un número negativo para acabar): ");
            numero = sc.nextInt();

            if (numero > 0) {
                sumadepositivos += numero;
                contadordepositivos++;
            }
        }
        while (numero > 0);

        if (contadordepositivos > 0) {
            promedio = sumadepositivos / contadordepositivos;
            System.out.print("el promedio de los negatisvo es: " + promedio);
        } else {
            System.out.println("No se ingresaron números positivos, por lo tanto no se puede calcular el promedio");
        }


    }
}