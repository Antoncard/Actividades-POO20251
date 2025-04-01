import java.util.Scanner;

public class OrdenamientoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variables
        int num1 , num2 , num3;

        System.out.print("Ingrese un numero del primero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese un numero del segundo: ");
        num2 = sc.nextInt();
        System.out.print("Ingrese un numero del tercero: ");
        num3 = sc.nextInt();

        //orden original
        System.out.println("El orden original de entrada de los numero es: " + num1+","+ num2+","+ num3);

        //numero en orden

        int mayor , medio , menor ;
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
                mayor = num2;
            } else {
                medio = num2;
                mayor = num1;
            }
        }

        System.out.println("Numero ordenandos de menor a mayor son: " + menor +","+medio +","+mayor);






    }
}