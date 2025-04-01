
public class ArregloCaracteres {
    public static void main(String[] args) {

        char [] caracteres = new char[10]; //arreglo
        caracteres[0] = 'A';
        caracteres[1] = 'B';
        caracteres[2] = 'C';
        caracteres[3] = 'D';
        caracteres[4] = 'E';
        caracteres[5] = 'F';
        caracteres[6] = 'G';
        caracteres[7] = 'H';
        caracteres[8] = 'I';
        caracteres[9] = 'J';

        System.out.println("Contenido del arreglo caracteres:"); //para que se vea mas estectico en la consola
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Posición " + i + ": " + caracteres[i]);
        }



    }
}