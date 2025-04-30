import java.util.Scanner;

public class ConvertidordeMaya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
// Menu para hacer varios numeros
        do {
            System.out.print("Ingresa un número entero positivo: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("El número debe ser positivo.");
            } else {
                convertirMaya(numero);
            }

            // Menu para repetir el programa
            System.out.println("Quieres volverlo a hacer?");
            System.out.println("Presiona 1 para ingresar otro número");
            System.out.println("Presiona 2 para salir");
            System.out.print("Respuesta: ");
            opcion = scanner.nextInt();

            while (opcion != 1 && opcion != 2) {
                System.out.print("Solo tienes 2 opciones. Intenta de nuevo: ");
                opcion = scanner.nextInt();
            }

        } while (opcion == 1);
        scanner.close();
    }
// convertir a maya
    public static void convertirMaya(int numero) { // tomar el numero ya usado
        int[] base20 = new int[20]; // 20 niveles para utilizarlo en numeros grandes
        int indice = 0; // para poder trabjar en los ciclos
        int original = numero; // para guardar el numero original

        while (numero > 0) { // es para sacar las veintenas
            base20[indice] = numero % 20;
            numero = numero / 20;
            indice++;
        }

        System.out.println("Número en notación maya (de arriba hacia abajo):");

        if (original == 0) { // caso de 0
            imprimirMaya(0);
            return;
        }

        for (int i = indice - 1; i >= 0; i--) {
            imprimirMaya(base20[i]);
            System.out.println(); // Salto entre niveles
        }
    }
    // Veintenas
    public static void imprimirMaya(int valor) {
        if (valor == 0) {
            System.out.println("⓪");
            return;
        }

        // Puntos
        int puntos = valor % 5;
        if (puntos > 0) {
            for (int i = 0; i < puntos; i++) {
                System.out.print("●");
            }
            System.out.println();
        }

        // Barras
        int barras = valor / 5; //
        if (barras > 0) {
            for (int i = 0; i < barras; i++) {
                System.out.print(" — ");
            }
            System.out.println();
        }
    }
}


