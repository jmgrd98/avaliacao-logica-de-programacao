import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int numCarrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: R$ ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor da comissão por carro vendido: R$ ");
        double comissaoPorCarro = scanner.nextDouble();

        double comissaoTotal = numCarrosVendidos * comissaoPorCarro;

        double comissaoVendas = valorTotalVendas * 0.05;

        double salarioFinal = salarioFixo + comissaoTotal + comissaoVendas;

        System.out.printf("Salário fixo: R$ %.2f%n", salarioFixo);
        System.out.printf("Comissão pelos carros vendidos: R$ %.2f%n", comissaoTotal);
        System.out.printf("Comissão de 5%% sobre o total das vendas: R$ %.2f%n", comissaoVendas);
        System.out.printf("Salário final do vendedor: R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}
