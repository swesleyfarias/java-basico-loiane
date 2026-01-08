package estrutura_sequencial;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double farenheit = Double.parseDouble(input.nextLine());
        double celsius = (5*(farenheit-32)/9);
        
        System.out.printf("Conversão: %.1f%s%n", celsius,"°C");
        input.close();
    }    
}
