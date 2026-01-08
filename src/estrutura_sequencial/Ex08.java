package estrutura_sequencial;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double dinheiro = Double.parseDouble(input.nextLine());

        System.out.println("Quantas horas você trabalhou no mês? ");
        double horas = Double.parseDouble(input.nextLine());
        double salarioTotal = dinheiro*horas;
        
        System.out.println("Seu sálario por mês: " + salarioTotal + "R$");
        input.close();
    }
}
