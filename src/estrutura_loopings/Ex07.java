package estrutura_loopings;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 5 números: ");
        double num1 = Double.parseDouble(input.nextLine());
        double maior = num1;
        for (int i = 0; i<4; i++) {
            double num = Double.parseDouble(input.nextLine());
            if (num>maior) {
                maior=num;
            }
        }
        System.out.println("O maior número é: " + maior);
        input.close();
    }
}