import java.util.Scanner;

public class ConteoPositivosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variables
        int contadorP = 0;
        int contadorN = 0;

        for (int i = 0; i < 10; i++) { //clasificacion de numeros
            System.out.print("Ingrese el numero "+(i+1)+":");
            int num = sc.nextInt();

            if (num > 0){//if para saber si son negativos o postivos
                contadorP++;
            } else if (num<0) {
                contadorN++;
                
            }
        }

        //contador de positivos y negativos
        System.out.println("La cantidad de numeros positivos son : "+contadorP);
        System.out.println("La cantidad de numeros negativos son : "+contadorN);


    }
}