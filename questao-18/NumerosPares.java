import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int quantidade = scanner.nextInt();

        System.out.println("Digite os números:");

        for (int i = 0; i < quantidade; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}
