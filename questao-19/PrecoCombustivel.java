import java.util.Scanner;

public class PrecoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de litros vendidos: ");
        double litros = scanner.nextDouble();

        System.out.print("Digite o tipo de combustível (A - Álcool, G - Gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);

        double precoLitro = 0.0;

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            precoLitro = 2.90; // Preço do álcool
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            precoLitro = 3.30; // Preço da gasolina
        } else {
            System.out.println("Tipo de combustível inválido.");
            scanner.close();
            return;
        }

        double valorPago = litros * precoLitro;
        System.out.printf("Valor a ser pago: R$ %.2f%n", valorPago);

        scanner.close();
    }
}
