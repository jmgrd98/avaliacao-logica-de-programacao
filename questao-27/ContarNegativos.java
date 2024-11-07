import java.util.Scanner;

public class ContarNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        for (int i = 0; i < 10; i++) {
            int valor = scanner.nextInt();
            if (valor < 0) {
                contador++;
            }
        }

        System.out.println("Quantidade de valores negativos: " + contador);

        scanner.close();
    }
}
