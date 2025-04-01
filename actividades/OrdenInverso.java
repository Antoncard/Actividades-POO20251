import java.util.Scanner;

public class OrdenInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] num = new int[11];


        System.out.println("Ingrese 10 numeros enteros ");
        for (int i = 1; i < num.length; i++) {
            System.out.println("numero " + i + ": ");
            num[i] = sc.nextInt();
        }

        System.out.println("Numeros en orden inverso: ");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }

    }
}