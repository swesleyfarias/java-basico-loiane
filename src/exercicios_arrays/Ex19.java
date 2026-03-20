package exercicios_arrays;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] result = new double[10];
        String[] aluno = new String[10];

        for (int i = 0; i<aluno.length; i++) {
            System.out.printf("Aluno %d: %n", i);
            System.out.print("Nota 1: ");
            nota1[i] = Double.parseDouble(input.nextLine());
            System.out.print("Nota 2: ");
            nota2[i] = Double.parseDouble(input.nextLine());
        }

        for (int i = 0; i<aluno.length; i++) {
            result[i] = (nota1[i]+nota2[i]) / 2.0;
            if (result[i]<7.0) {
                aluno[i] = "Reprovado.";
            } else {
                aluno[i] = "Aprovado.";
            }
        }

        for (int i = 0; i<aluno.length; i++) {
            System.out.printf("\nAluno %d: %n", i);
            System.out.printf("Nota: %.1f%n", result[i]);
            System.out.printf("Situação: %s%n", aluno[i]);
        }

        input.close();
    }
}
