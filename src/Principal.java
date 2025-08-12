import ListadoPaises.LectorListado;

import java.util.Scanner;

public class Principal {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ConsultaAPI search = new ConsultaAPI();

        double monto;
        double resultado;

        int opcion;

        do {
            System.out.println("==================================================");
            System.out.println("      Bienvenidos al Conversor de Monedas      ");
            System.out.println("==================================================");
            System.out.println(" 1. Mostrar tabla de monedas");
            System.out.println(" 2. Pesos Chilenos a Reales Brasileños");
            System.out.println(" 3. Reales Brasileños a Pesos Chilenos");
            System.out.println(" 4. Reales Brasileños a Dólares");
            System.out.println(" 5. Dólares a Reales Brasileños");
            System.out.println(" 6. Dólares a Pesos Chilenos");
            System.out.println(" 7. Pesos Chilenos a Dólares");
            System.out.println(" 8. Salir del sistema");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción (1-8): ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n-----------------------");
                    System.out.println("   Tabla de Monedas   ");
                    System.out.println("-----------------------");
                    LectorListado.mostrarTabla();
                    break;
                case 2: // CLP a BRL
                    monto = pedirMontoValido("$ CLP");
                    if (monto <= 0) break;
                    resultado = Double.parseDouble(search.SearchMoney("CLP", "BRL", monto).conversion_result());
                    System.out.println("-----------------------");
                    System.out.printf("Conversión: $%.2f CLP = R$%.2f BRL%n", monto, resultado);
                    System.out.println("-----------------------");
                    break;
                case 3: // BRL a CLP
                    monto = pedirMontoValido("R$ BRL");
                    if (monto <= 0) break;
                    resultado = Double.parseDouble(search.SearchMoney("BRL", "CLP", monto).conversion_result());
                    System.out.println("-----------------------");
                    System.out.printf("Conversión: R$%.2f BRL = $%.2f CLP%n", monto, resultado);
                    System.out.println("-----------------------");
                    break;
                case 4: // BRL a USD
                    monto = pedirMontoValido("R$ BRL");
                    if (monto <= 0) break;
                    resultado = Double.parseDouble(search.SearchMoney("BRL", "USD", monto).conversion_result());
                    System.out.println("-----------------------");
                    System.out.printf("Conversión: R$%.2f BRL = $%.2f USD%n", monto, resultado);
                    System.out.println("-----------------------");
                    break;
                case 5: // USD a BRL
                    monto = pedirMontoValido("$ USD");
                    if (monto <= 0) break;
                    resultado = Double.parseDouble(search.SearchMoney("USD", "BRL", monto).conversion_result());
                    System.out.println("-----------------------");
                    System.out.printf("Conversión: $%.2f USD = R$%.2f BRL%n", monto, resultado);
                    System.out.println("-----------------------");
                    break;
                case 6: // USD a CLP
                    monto = pedirMontoValido("$ USD");
                    if (monto <= 0) break;
                    resultado = Double.parseDouble(search.SearchMoney("USD", "CLP", monto).conversion_result());
                    System.out.println("-----------------------");
                    System.out.printf("Conversión: $%.2f USD = $%.2f CLP%n", monto, resultado);
                    System.out.println("-----------------------");
                    break;
                case 7: // CLP a USD
                    monto = pedirMontoValido("$ CLP");
                    if (monto <= 0) break;
                    resultado = Double.parseDouble(search.SearchMoney("CLP", "USD", monto).conversion_result());
                    System.out.println("-----------------------");
                    System.out.printf("Conversión: $%.2f CLP = $%.2f USD%n", monto, resultado);
                    System.out.println("-----------------------");
                    break;
                case 8:
                    System.out.println("==================================================");
                    System.out.println("            ...Saliendo del sistema...");
                    System.out.println("              ¡Gracias, vuelva pronto!");
                    System.out.println("==================================================");
                    break;
                default:
                    System.out.println("Error: Opción inválida, intente de nuevo.");
            }
        } while (opcion != 8);

        scanner.close();

    }

    private static double pedirMontoValido(String moneda) {
        System.out.print("Ingrese el monto a convertir (" + moneda + "): ");
        try {
            double monto = Double.parseDouble(scanner.nextLine());
            if (monto <= 0) {
                System.out.println("Error: El monto debe ser mayor a 0.");
                return -1;
            }
            return monto;
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un valor numérico válido.");
            return -1;
        }
    }
}
