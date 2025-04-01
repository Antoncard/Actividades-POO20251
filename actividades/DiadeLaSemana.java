import java.util.Scanner;

public class DiadelaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero del 1 al 7 para saber el dia: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("el dia es lunes");
                break;

                case 2:
                    System.out.println("el dia es martes");
                    break;

                    case 3:
                        System.out.println("el dia es miercoles");
                        break;

                        case 4:
                            System.out.println("el dia es jueves");
                            break;

                            case 5:
                                System.out.println("el dia es viernes");
                                break;

                                case 6:
                                    System.out.println("el dia es sabado");
                                    break;

                                    case 7:
                                        System.out.println("el dia es domingo");
                                        break;
                                        default:
                                            System.out.println("El dia no es valido por favor ingrese un numero del 1 al 7");
                                            break;



        }


        }
    }
