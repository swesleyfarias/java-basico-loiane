package estrutura_sequencial;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite sua altura: ");
        double altura = Double.parseDouble(input.nextLine());
        double pesoIdeal = (72.7*altura) - 58;

        System.out.printf("Seu peso ideal: %.1f%n", pesoIdeal);
        input.close();
    }
}
