import java.util.Scanner;

public class ConversorBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número binario de 16 dígitos: ");
        String binario = scanner.nextLine();

        // Verificar que la longitud del número binario sea 16
        if (binario.length() != 16 || !binario.matches("[01]+")) {
            System.out.println("El número binario ingresado no es válido.");
            return;
        }

        // Convertir el número binario a decimal
        int decimal = Integer.parseInt(binario, 2);
        System.out.println("Decimal: " + decimal);

        // Convertir el número decimal a octal
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal: " + octal);

        // Convertir el número decimal a hexadecimal
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal: " + hexadecimal.toUpperCase());
    }
}
