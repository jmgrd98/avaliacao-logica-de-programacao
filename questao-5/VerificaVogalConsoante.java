import java.util.Scanner;

public class VerificaVogalConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().toLowerCase().charAt(0);

        if (caractere >= 'a' && caractere <= 'z') {
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                System.out.println("O caractere é uma vogal.");
            } else {
                System.out.println("O caractere é uma consoante.");
            }
        } else {
            System.out.println("O caractere não é uma letra.");
        }

        scanner.close();
    }
}
