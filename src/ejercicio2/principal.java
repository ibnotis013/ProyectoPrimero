package ejercicio2;

import java.util.Scanner;

public class principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la base");
        int base =sc.nextInt();
        System.out.println("introduce la altura");
        int altura =sc.nextInt();
        double area= (double) (base*altura)/2;
        int perimetro=2*(base+altura);
        System.out.println("el area es "+ area );
        System.out.println("el perimetro es "+ perimetro);
    }
}
