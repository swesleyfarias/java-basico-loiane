package estrutura_loopings;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 5 números: ");
        double soma = 0;
        for (int i = 0; i<5; i++) {
            double num = Double.parseDouble(input.nextLine());
            soma+=num;
        }
        double media = soma/5;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        input.close();
    }
}
