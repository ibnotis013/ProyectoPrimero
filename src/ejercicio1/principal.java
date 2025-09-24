package ejercicio1;

import java.util.Scanner;

public class principal {
    public static void main() {

        Scanner teclado = new Scanner(System.in);
        String nombre= "nicolas";
        System.out.println("mi nombre es " +nombre );
        nombre= "iker";
        System.out.println("y el de mi izquierda es " +nombre );
        System.out.println("introdizca el nombre del cabezon de mi derecha");
        String nombrepersona=teclado.nextLine();
        System.out.println("el nombre es "+nombrepersona);

    }
}
