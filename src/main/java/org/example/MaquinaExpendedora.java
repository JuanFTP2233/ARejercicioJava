import java.util.Scanner;

public class MaquinaExpendedora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] productos = {"Agua", "Refresco", "Papas", "Chocolate", "Galletas"};
        double[] precios = {1.0, 1.5, 1.2, 1.8, 1.0};
        double dineroIngresado = 0;
        double totalCompra = 0;
        int opcion;

        System.out.println("Bienvenido a la máquina expendedora");

        do {

            System.out.println("\nProductos disponibles:");
            for (int i = 0; i < productos.length; i++) {
                System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
            }
            System.out.println("6. Salir");


            System.out.print("Seleccione un producto (1-6): ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 5) {

                if (dineroIngresado >= precios[opcion - 1]) {
                    dineroIngresado -= precios[opcion - 1];
                    totalCompra += precios[opcion - 1];
                    System.out.println("Ha comprado: " + productos[opcion - 1]);
                } else {
                    System.out.println("Dinero insuficiente. Ingrese más dinero.");
                }
            } else if (opcion != 6) {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 6 && totalCompra < 5 * 1.8);


        System.out.println("\nResumen de la compra:");
        System.out.println("Total gastado: $" + totalCompra);
        System.out.println("Cambio devuelto: $" + dineroIngresado);
        System.out.println("Gracias por usar la máquina expendedora. ¡Vuelva pronto!");

        sc.close();
    }
}