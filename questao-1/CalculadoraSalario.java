import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do empregado: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de aumento (%): ");
        double percentualAumento = scanner.nextDouble();

        double valorAumento = salarioAtual * (percentualAumento / 100);

        double novoSalario = salarioAtual + valorAumento;

        System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);

        scanner.close();
    }
}
