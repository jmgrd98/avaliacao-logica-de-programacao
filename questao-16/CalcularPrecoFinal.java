import java.util.Scanner;

public class CalcularPrecoFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço original do produto: R$ ");
        double precoOriginal = scanner.nextDouble();

        System.out.print("Digite o desconto (%): ");
        double desconto = scanner.nextDouble();

        double valorDesconto = (precoOriginal * desconto) / 100;
        double precoFinal = precoOriginal - valorDesconto;

        System.out.printf("Preço original: R$ %.2f%n", precoOriginal);
        System.out.printf("Desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Preço final com desconto: R$ %.2f%n", precoFinal);

        scanner.close();
    }
}
