import java.util.Scanner;

public class AreaQuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            double lado = scanner.nextDouble();
            double area = lado * lado;
            System.out.println("Área do quadrado: " + area);
        }

        scanner.close();
    }
}
