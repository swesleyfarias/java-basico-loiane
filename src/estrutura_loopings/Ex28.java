package estrutura_loopings;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cds;

        do {
            System.out.println("Digite a quantidade de CDs: ");
            cds = Integer.parseInt(input.nextLine());
            
            if (cds<2) {
                System.out.println("A quantidade precisa ser maior que 1.");
            }
        } while (cds<2);

        double soma_cd = 0;

        for (int i = 1; i<=cds; i++) {
            System.out.printf("Valor CD %d: %n", i);
            double valor = Double.parseDouble(input.nextLine());

            while (valor<0) {
                System.out.println("O valor precisa ser positivo! Tente novamente.");
                valor = Double.parseDouble(input.nextLine());
            }
            soma_cd+=valor;
        }

        double media = (double) soma_cd/cds;
        System.out.printf("Valor total investido: %.2f$ %n",soma_cd);
        System.out.printf("Valor médio gasto: %.2f$ %n", media);
        input.close();
    }
}
