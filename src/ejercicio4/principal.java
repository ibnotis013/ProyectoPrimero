package ejercicio4;

import javax.swing.*;
import java.util.Scanner;

public class principal {
    static void main() {

        System.out.println("introduce un numero entero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (numero%2==0){
            System.out.println("el numero es par");

        }
        else{
            System.out.println("el numero es impar");
        }
    }
}
