package estrutura_loopings;

import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        double[] saltos = new double[5];

        while (true) {
            double melhor = 0, pior = 0, media = 0;
            System.out.print("Atleta: ");
            nome = input.nextLine();

            if (nome.isEmpty()) {
                break;
            }

            System.out.print("Primeiro salto: ");
            saltos[0] = Double.parseDouble(input.nextLine());

            System.out.print("Segundo salto: ");
            saltos[1] = Double.parseDouble(input.nextLine());

            System.out.print("Terceiro salto: ");
            saltos[2] = Double.parseDouble(input.nextLine());

            System.out.print("Quarto salto: ");
            saltos[3] = Double.parseDouble(input.nextLine());

            System.out.print("Quinto salto: ");
            saltos[4] = Double.parseDouble(input.nextLine());

            melhor = saltos[0];
            pior = saltos[0];
            for (int i = 1; i < saltos.length; i++) {
                if (saltos[i] > melhor) {
                    melhor = saltos[i];
                }

                if (saltos[i] < pior) {
                    pior = saltos[i];
                }
            }

            System.out.printf("Melhor salto: %.1fm%n", melhor);
            System.out.printf("Pior salto: %.1fm%n", pior);

            for (int i = 0; i < saltos.length; i++) {
                media += saltos[i];
            }

            media = (media - (pior + melhor)) / 3.0;
            System.out.printf("Média dos saltos: %.1fm%n", media);
            System.out.printf("%nResultado Final:%n");
            System.out.printf("%s: %.1fm %n%n", nome, media);
        }

        input.close();
    }
}
