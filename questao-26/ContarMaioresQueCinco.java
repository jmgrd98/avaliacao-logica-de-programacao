import java.util.Scanner;

public class ContarMaioresQueCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        for (int i = 0; i < 20; i++) {
            int valor = scanner.nextInt();
            if (valor >= 5) {
                contador++;
            }
        }

        System.out.println("Quantidade de valores maiores ou iguais a 5: " + contador);

        scanner.close();
    }
}
