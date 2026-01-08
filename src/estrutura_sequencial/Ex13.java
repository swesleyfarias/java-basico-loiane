package estrutura_sequencial;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pesoIdeal = 0;
        System.out.println("Digite sua altura: ");
        double altura = Double.parseDouble(input.nextLine());

        System.out.println("Qual é o seu sexo? (M ou H) ");
        char sexo = input.nextLine().toUpperCase().charAt(0);

        if (sexo=='M') {
            pesoIdeal = (62.1*altura) - 44.7;
        } 
        if (sexo=='H') {
            pesoIdeal =  (72.7*altura) - 58;
        }
        
        System.out.println("Digite seu peso: ");
        double pesoPessoal = Double.parseDouble(input.nextLine());

        if (pesoPessoal>pesoIdeal) {
            System.out.println("Você está acima do peso ideal.");
        } 
        if (pesoPessoal<pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal.");
        }
        if (pesoPessoal==pesoIdeal) {
            System.out.println("Você está no peso ideal.");
        }
        input.close();
   }    
}
