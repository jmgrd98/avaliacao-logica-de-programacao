import java.util.Scanner;

public class MediaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        for (int i = 0; i < 10; i++) {
            soma += scanner.nextDouble();
        }

        double media = soma / 10;

        System.out.println("Média dos valores lidos: " + media);

        scanner.close();
    }
}
