import java.util.Scanner;

public class PrimeraCifra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // variables
        System.out.print("Ingrese un numero de 5 digitos: ");
        int num = sc.nextInt();

        //validar el rango
        if (num >= -99999 && num <= 99999) {
            int numerocompleto = Math.abs(num);
            int PrimeraCifra = numerocompleto;

            while (PrimeraCifra >=10) {
                PrimeraCifra/=10;

            }
            System.out.println("La primera cifra es : " + PrimeraCifra);

        } else {
            System.out.println("El numero no es valido digite un numero de 5 digitos");
        }



        }
    }
