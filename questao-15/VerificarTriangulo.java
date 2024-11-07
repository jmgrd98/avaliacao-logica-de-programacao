import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        scanner.close();
    }
}
