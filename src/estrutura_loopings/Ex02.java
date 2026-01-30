package estrutura_loopings;

import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usuario, senha;
        do {
            System.out.println("Digite seu usuário: ");
            usuario = input.nextLine();

            System.out.println("Digite sua senha: ");
            senha = input.nextLine();

            if (senha.equalsIgnoreCase(usuario)) {
                System.out.println("A senha não pode ser igual ao usuário.\n");
            }
        } while (senha.equalsIgnoreCase(usuario));
        input.close();
    }
}
