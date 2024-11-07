import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int anoNascimento = scanner.nextInt();
        int anoIngresso = scanner.nextInt();

        int idade = 2024 - anoNascimento;
        int tempoTrabalho = 2024 - anoIngresso;

        String mensagem = "Não requerer";
        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            mensagem = "Requerer aposentadoria";
        }

        System.out.println("Idade: " + idade);
        System.out.println("Tempo de trabalho: " + tempoTrabalho);
        System.out.println(mensagem);

        scanner.close();
    }
}
