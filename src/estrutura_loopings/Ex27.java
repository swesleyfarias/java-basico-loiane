package estrutura_loopings;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int turmas;
        
        do {
            System.out.println("Digite a quantidade de turmas: ");
            turmas = Integer.parseInt(input.nextLine());

            if (turmas<2) {
                System.out.println("Turmas deve ser maior que 1.");
            }
        } while (turmas<2);

        int soma_alunos = 0;
        for (int i = 1; i<=turmas; i++) {
            System.out.printf("Alunos da turma %d: %n", i);
            int alunos = Integer.parseInt(input.nextLine());
            while (alunos<1 || alunos>40) {
                System.out.println("Os alunos da turma tem que ser entre 1 e 40.");
                alunos = Integer.parseInt(input.nextLine());
            }
            soma_alunos+=alunos;
        }

        double media = (double) soma_alunos/turmas;
        System.out.printf("Alunos por turma: %.1f %n", media);
        input.close();
    }
}
