import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scan = new Scanner(System.in);

        while (flag) {
            System.out.println("Que Area quieres calcular? \n1. Triangulo\n2. Cuadrado\n3. Rectangulo\n4. Circulo\n5. Salir");

            int opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la base del triángulo: ");
                    double base = scan.nextDouble();

                    System.out.println("Ingresa la altura del triángulo: ");
                    double altura = scan.nextDouble();

                    System.out.println("El area del triangulo es: " + (base * altura) / 2);
                    break;
                case 2:
                    System.out.println("Ingresa la medida del lado del cuadrado: ");
                    double lado = scan.nextDouble();

                    System.out.println("El area del cuadrado es: " + (lado * lado));
                    break;
                case 3:
                    System.out.println("Ingresa la base del rectangulo: ");
                    double baseR = scan.nextDouble();

                    System.out.println("Ingresa la altura del rectangulo: ");
                    double alturaR = scan.nextDouble();

                    System.out.println("El area del rectangulo es: " + (baseR * alturaR));
                    break;
                case 4:
                    System.out.println("Ingresa el radio del circulo: ");
                    double radio = scan.nextDouble();

                    System.out.println("El area del circulo es: " + (3.1416 * (radio * radio)));
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    flag = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
                    break;
            }
        }
    }
}