import java.util.Scanner;

public class SomaPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        for (int i = 0; i < 30; i++) {
            double numero = scanner.nextDouble();
            if (numero > 0) {
                soma += numero;
            }
        }

        System.out.println("Soma dos números positivos: " + soma);

        scanner.close();
    }
}
