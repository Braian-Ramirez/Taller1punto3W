import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean valor1, valor2, resultado;
        int numerOperaciones;
        String opeador;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Ingrese la cantidad de veces que desea realizar la operación: ");
            numerOperaciones = scan.nextInt();
            System.out.println("Ingrese el primer valor booleano (true/false): ");
            valor1 = scan.nextBoolean();
            System.out.println("Ingrese el segundo valor booleano (true/false): ");
            valor2 = scan.nextBoolean();
            while (numerOperaciones != 0) {

                System.out.println("Ingrese la operación a realizar (AND/OR/XOR): ");
                opeador = scan.nextLine();

                if (opeador.equals("AND")) {
                    resultado = valor1 && valor2;
                    numerOperaciones--;
                    System.out.println("El resultado de la operación AND es: " + resultado);
                }
                if (opeador.equals("OR")) {
                    resultado = valor1 || valor2;
                    numerOperaciones--;
                    System.out.println("El resultado de la operación OR es: " + resultado);
                }
                if (opeador.equals("XOR")) {
                    resultado = valor1 ^ valor2;
                    numerOperaciones--;
                    System.out.println("El resultado de la operación XOR es: " + resultado);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);

        }
    }
}