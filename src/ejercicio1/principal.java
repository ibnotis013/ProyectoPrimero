package ejercicio1;

import java.util.Scanner;

public class principal {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("introduce el segundo numero");
        int num2 = teclado.nextInt();
        int resultadosuma= num1+num2;
        System.out.println("el resultado de la suma es : "+resultadosuma);
        int   resultadoresta= num1-num2;
        System.out.println("el resultado de la resta es "+resultadoresta);
        double resultadodiv= (double) num1 /num2;
        System.out.println("el resultado de la div es "+resultadodiv);
        int  resultadomulti= num1*num2;
        System.out.println("el resultado de la multiplicacion es "+resultadomulti);
    }
}
