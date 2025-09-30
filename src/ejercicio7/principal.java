package ejercicio7;

import java.util.Scanner;

public class principal {
    static void main() {
    Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero del 0 al 10");
        double numero = sc.nextDouble();

        if(!(numero>=0 && numero<=10)){
            System.out.println("la nota tiene que estar entre 0 y 10");
        }
        else{
            if (numero <5) {
                System.out.println("suspenso");
            }
            else if (numero<6) {
                System.out.println("aprobado");
            }
            else if (numero<7) {
                System.out.println("Bien");
            }
            else if (numero<9) {
                System.out.println("Notable");
            }
            else {
                System.out.println("sobresaliente");
            }
        }
    }
}
