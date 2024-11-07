import java.util.Scanner;

public class Fruteira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de morangos (em Kg): ");
        double kgMorangos = scanner.nextDouble();

        System.out.print("Digite a quantidade de maçãs (em Kg): ");
        double kgMacas = scanner.nextDouble();

        double precoMorangos = kgMorangos <= 5 ? kgMorangos * 2.50 : kgMorangos * 2.20;
        double precoMacas = kgMacas <= 5 ? kgMacas * 1.80 : kgMacas * 1.50;

        double total = precoMorangos + precoMacas;

        if (kgMorangos + kgMacas > 8 || total > 25) {
            total *= 0.90; // Desconto de 10%
        }

        System.out.printf("Valor a ser pago: R$ %.2f%n", total);

        scanner.close();
    }
}
