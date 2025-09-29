package ejercicio3;

import java.util.Scanner;

public class principal {
    static void main() {
        System.out.println("introduzca la edad ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        if (edad>=18)
        {
            System.out.println("puedes pasar ya que eres mayer de edad");
        }else{
                System.out.println("eres menor no puedes pasar ");
            }

    }
}
