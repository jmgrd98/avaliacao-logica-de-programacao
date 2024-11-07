import java.util.Scanner;

public class AcessoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCorreto = 1234;
        int senhaCorreta = 9999;

        System.out.print("Digite o código do usuário: ");
        int codigo = scanner.nextInt();

        if (codigo != codigoCorreto) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.print("Digite a senha: ");
            int senha = scanner.nextInt();

            if (senha != senhaCorreta) {
                System.out.println("Senha incorreta");
            } else {
                System.out.println("Acesso permitido");
            }
        }

        scanner.close();
    }
}
