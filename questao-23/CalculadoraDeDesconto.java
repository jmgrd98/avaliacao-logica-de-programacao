import java.util.Scanner;

public class CalculadoraDeDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a descrição do produto: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário: R$ ");
        double precoUnitario = scanner.nextDouble();

        double total = quantidade * precoUnitario;
        double desconto = 0.0;

        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade > 5 && quantidade <= 10) {
            desconto = total * 0.03;
        } else if (quantidade > 10) {
            desconto = total * 0.05;
        }

        double totalAPagar = total - desconto;

        System.out.printf("Total: R$ %.2f%n", total);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Total a pagar: R$ %.2f%n", totalAPagar);

        scanner.close();
    }
}
