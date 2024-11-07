import java.util.Scanner;

public class SaldoConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo da conta: R$ ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o débito: R$ ");
        double debito = scanner.nextDouble();

        System.out.print("Digite o crédito: R$ ");
        double credito = scanner.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.printf("Saldo atual: R$ %.2f%n", saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        scanner.close();
    }
}
