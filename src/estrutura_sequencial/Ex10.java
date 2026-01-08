package estrutura_sequencial;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius: ");
        double celsius = Double.parseDouble(input.nextLine());
        
        double fahrenheit = (1.8*celsius)+32;
        System.out.printf("Fahrenheit: %.1f%s%n", fahrenheit, "°F");
        input.close();
    }    
}
