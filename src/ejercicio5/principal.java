package ejercicio5;

import java.util.Scanner;

public class principal {
    static void main() {

        System.out.println("introduce el precio de el producto");
        Scanner sc = new Scanner(System.in);
        double precio = sc.nextDouble();

        if (precio>=100) {
            double precioRebajado = precio - precio*0.15;
            System.out.println("el precio rebajado es "+precioRebajado);
        }
        else {
            System.out.println("el precio rebajado es "+precio);
        }
    }
}
