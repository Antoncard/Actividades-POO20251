import java.util.Scanner;

public class PiramieNumerica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero que va arriba de la piramide: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = 1; j <= num- i; j++) {
                System.out.print(" ");
            }

            //numeros ascendentes
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            //numeros descendentes
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }




    }
}