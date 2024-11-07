import java.util.Scanner;

public class JogoDeFutebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro time: ");
        String time1 = scanner.nextLine();

        System.out.print("Digite o número de gols do " + time1 + ": ");
        int golsTime1 = scanner.nextInt();

        scanner.nextLine(); // Consumir a linha em branco

        System.out.print("Digite o nome do segundo time: ");
        String time2 = scanner.nextLine();

        System.out.print("Digite o número de gols do " + time2 + ": ");
        int golsTime2 = scanner.nextInt();

        if (golsTime1 > golsTime2) {
            System.out.println("Vencedor: " + time1);
        } else if (golsTime2 > golsTime1) {
            System.out.println("Vencedor: " + time2);
        } else {
            System.out.println("EMPATE");
        }

        scanner.close();
    }
}
