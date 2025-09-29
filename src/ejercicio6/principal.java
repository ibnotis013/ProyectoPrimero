package ejercicio6;

import java.util.Scanner;

public class principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un nombre de usuario");
        String nombre = sc.nextLine();
        if (nombre.equals("admin")) {
            System.out.println("Bienvenido");
        }
        else {
            System.out.println("Acceso denegado");

        }
    }
}
