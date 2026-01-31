package estrutura_loopings;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 2 números: ");
        int num1 = Integer.parseInt(input.nextLine());
        int num2 = Integer.parseInt(input.nextLine());
        int soma = 0;
        if (num1>num2) {
            System.out.println("Intervalo:");
            for (int i = num1-1; i>num2; i--) {
                System.out.println(i);
                soma+=i;
            }
            System.out.println("Soma: " + soma);
        } else if (num2>num1) {
            System.out.println("Intervalo:");
            for (int i = num1+1; i<num2; i++) {
                System.out.println(i);
                soma+=i;
            }
            System.out.println("Soma: " + soma);
        } else {
            System.out.println("Os números são iguais.");
        }
        input.close();
    }
}
