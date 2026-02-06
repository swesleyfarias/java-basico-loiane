package estrutura_loopings;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.println("Digite a quantidade de pessoas: ");
            n = Integer.parseInt(input.nextLine());

            if (n<2) {
                System.out.println("A quantidade precisa ser maior ou igual a 2.");
            }
        } while (n<2);

        int soma_idades = 0;
        for (int i = 1; i<=n; i++) {
            System.out.printf("Idade da pessoa %d: %n", i);
            int idade = Integer.parseInt(input.nextLine());

            while (idade<0) {
                System.out.println("Não existe idade negativa! Digite novamente: ");
                idade = Integer.parseInt(input.nextLine());
            }
            soma_idades+=idade;
        }

        double media = (double) soma_idades/n;
        if (media<25) {
            System.out.println("A turma é jovem.");
        } else if (media<60) {
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }
        input.close();
    }
}
