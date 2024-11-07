import java.util.Scanner;

public class MediaPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int contador = 0;

        for (int i = 0; i < 20; i++) {
            double numero = scanner.nextDouble();
            if (numero > 0) {
                soma += numero;
                contador++;
            }
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Média dos números positivos: " + media);
        } else {
            System.out.println("Nenhum número positivo foi recebido.");
        }

        scanner.close();
    }
}
