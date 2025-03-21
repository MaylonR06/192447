import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero entero");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("ingrese su nombre");
        String nombre = scanner.nextLine();

        System.out.println("ingrese un numero para confirmar si es multiplo de 3");
        int numeroMultiplo = scanner.nextInt();
        System.out.println(numeroMultiplo % 3 == 0 ? "es multiplo de tres" : "no es multiplo de 3");

        System.out.println("Ingrese un numero para redondear");
        double numeroDecimal = scanner.nextDouble();
        System.out.println("Redondeando con Math round():" + Math.round(numeroDecimal));
        System.out.println("redondeando con casting explicito():" + (int) (numeroDecimal + 0.5));

        while (true) {
            System.out.println("ingrese un numero positivo(o numero negativo para salir):");
            int num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Saliendo del bucle");
                break;
            }
            System.out.println("ingresaste " + num);
        }

        scanner.nextLine();
        System.out.println("va a continuar? (si/no)");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Continuamos");
        } else {
            System.out.println("fin.");
        }

        scanner.close();
    }
}
