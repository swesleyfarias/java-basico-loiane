package estrutura_loopings;

import java.util.Scanner;

class Ex47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[7];

        while (true) {
            double melhor = 0, pior = 0, media = 0;
            System.out.print("Atleta: ");
            String nome = input.nextLine();

            if (nome.isEmpty()) {
                break;
            }

            for (int i = 0; i < notas.length; i++) {
                System.out.print("Nota: ");
                notas[i] = Double.parseDouble(input.nextLine());
            }

            pior = notas[0];
            melhor = notas[0];

            for (int i = 1; i < notas.length; i++) {
                if (notas[i] > melhor) {
                    melhor = notas[i];
                }

                if (notas[i] < pior) {
                    pior = notas[i];
                }
            }

            for (int i = 0; i < notas.length; i++) {
                media += notas[i];
            }
            media = (media - (pior + melhor)) / 5.0;

            System.out.println("Resultado final:");
            System.out.println("Atleta: " + nome);
            System.out.printf("Melhor nota: %.1f%n", melhor);
            System.out.printf("Pior nota: %.1f%n", pior);
            System.out.printf("Média: %.2f%n%n", media);
        }

        input.close();
    }
}