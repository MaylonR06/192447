import java.util.Scanner;

public class EjercicioTerrible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del primer estudiante:");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese la edad:");
        int edad1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del segundo estudiante:");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese la edad:");
        int edad2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del tercer estudiante:");
        String nombre3 = scanner.nextLine();
        System.out.println("Ingrese la edad:");
        int edad3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del cuarto estudiante:");
        String nombre4 = scanner.nextLine();
        System.out.println("Ingrese la edad:");
        int edad4 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del quinto estudiante:");
        String nombre5 = scanner.nextLine();
        System.out.println("Ingrese la edad:");
        int edad5 = scanner.nextInt();
        scanner.nextLine();

        double y = (b + d + f + h + j) / 5;

        System.out.println("Edad promedio de los estudiantes: " + y);

        if (b > 17) {
            System.out.println(a + " es mayor de edad");
        } else {
            System.out.println(a + " es menor de edad");
        }

        if (d > 17) {
            System.out.println(c + " es mayor de edad");
        } else {
            System.out.println(c + " es menor de edad");
        }

        if (f > 17) {
            System.out.println(e + " es mayor de edad");
        } else {
            System.out.println(e + " es menor de edad");
        }

        if (h > 17) {
            System.out.println(g + " es mayor de edad");
        } else {
            System.out.println(g + " es menor de edad");
        }

        if (j > 17) {
            System.out.println(i + " es mayor de edad");
        } else {
            System.out.println(i + " es menor de edad");
        }

        System.out.println("Programa finalizado.");
    }
}
