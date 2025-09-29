package ejercicio7;

import java.util.Scanner;

public class principal {
    static void main() {
    Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero del 0 al 10");
        int numero = sc.nextInt();

        if (numero <=4) {
            System.out.println("suspenso");
        }
        else if (numero==5) {
            System.out.println("aprobado");
        }
        else if (numero==6) {
            System.out.println("Bien");
        }
        else if (numero==7&&numero==8) {
            System.out.println("Notable");
        }
        else if (numero==9&&numero==10){
            System.out.println("sobresaliente");
        }
    }
}
