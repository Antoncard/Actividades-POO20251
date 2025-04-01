import java.util.Scanner;

public class ParImparArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] num = new int[8];

        System.out.println("Ingrese 8 numeros enteros :"); //orden de colocar los numeros
        for (int i = 0; i < num.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
        System.out.println("Clasificación de los números:"); // clasificacion de numeros
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i] + " es par");
            } else {
                System.out.println(num[i] + " es impar");
            }
        }

    }
}