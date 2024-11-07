import java.util.Scanner;

public class MediaDeAproveitamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double N1 = scanner.nextDouble();
        double N2 = scanner.nextDouble();
        double N3 = scanner.nextDouble();
        double Media_dos_Exercicios = scanner.nextDouble();

        double Media_de_Aproveitamento = (N1 + N2 * 2 + N3 * 3 + Media_dos_Exercicios) / 6;

        String conceito;
        if (Media_de_Aproveitamento >= 9.0) {
            conceito = "A";
        } else if (Media_de_Aproveitamento >= 7.5) {
            conceito = "B";
        } else if (Media_de_Aproveitamento >= 6.0) {
            conceito = "C";
        } else {
            conceito = "D";
        }

        System.out.println(conceito);

        scanner.close();
    }
}
