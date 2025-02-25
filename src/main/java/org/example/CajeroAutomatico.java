import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scConsola = new Scanner(System.in);
        double saldoCajeror = 50000;
        int opcion;

        do {
            System.out.println("\n1. Consultar el saldo\n2. Ingresar el dinero\n3. Retirar el dinero\n4. Bye");
            System.out.print("seleccion xfa: ");
            opcion = scConsola.nextInt();

            if (opcion == 1) System.out.println("Saldo: $" + saldoCajeror);
            else if (opcion == 2) saldoCajeror += scConsola.nextDouble();
            else if (opcion == 3) saldoCajeror -= scConsola.nextDouble();
        } while (opcion != 4);

        System.out.println("Cerrrar el banco");
        scConsola.close();
    }
}