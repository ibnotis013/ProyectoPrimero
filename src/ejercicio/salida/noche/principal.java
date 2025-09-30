package ejercicio.salida.noche;

import java.util.Scanner;

public class principal {
    static void main() {
        System.out.println("Vamos a tomar el aire bienvenido");
        double  nivelAlcohol= 0.0;
        double  precioChupito= 3;
        double  precioCaña= 1.8;
        double  precioCombinado= 8;
        double nivelChupito= 0.25;
        double  nivelCaña= 0.1;
        double  nivelCombinado= 0.4;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el nombre del cliente");
        String nombreCliente=sc.nextLine();
        System.out.printf("introduce la edad del cliente");
        int edadCliente=sc.nextInt();
        System.out.println("introduce el dinero del cliente");
        double dinero=sc.nextDouble();
        System.out.println("El nombre del cliente es "+nombreCliente+" con edad "+ edadCliente+ " y tiene " + dinero+" euros");



        if (edadCliente>=18&&nivelAlcohol<1.2) {
            System.out.println("puedes pasar");
            System.out.println("te tomas unos cubatillas " +(dinero-precioCombinado)+"te queda esta guita");
            if(dinero<=0){
                System.out.println("no tienes dinero no bebes mas");
            }
            System.out.println("te tomas otra ?");
            
        }
        else if (edadCliente<18) {
            System.out.println("No puedes pasar, eres menor de edad");
        }
        else if (edadCliente>=18&&nivelAlcohol>1.2) {
            System.out.println("no puedes pasar, vas borracho");
        }



    }
}
