import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: R$ ");
        double custoFabrica = scanner.nextDouble();

        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        double custoDistribuidor = custoFabrica * percentualDistribuidor;
        double custoImpostos = custoFabrica * percentualImpostos;

        double custoFinal = custoFabrica + custoDistribuidor + custoImpostos;

        System.out.printf("Custo de fábrica: R$ %.2f%n", custoFabrica);
        System.out.printf("Custo do distribuidor: R$ %.2f%n", custoDistribuidor);
        System.out.printf("Custo dos impostos: R$ %.2f%n", custoImpostos);
        System.out.printf("Custo final ao consumidor: R$ %.2f%n", custoFinal);

        scanner.close();
    }
}
