import java.util.Scanner;

public class ContaRestaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da refeição: R$ ");
        double valorRefeicao = scanner.nextDouble();

        double taxaServico = 0.10;

        double valorServico = valorRefeicao * taxaServico;
        double valorTotal = valorRefeicao + valorServico;

        System.out.printf("Valor do serviço (10%%): R$ %.2f%n", valorServico);
        System.out.printf("Valor total a ser pago: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
