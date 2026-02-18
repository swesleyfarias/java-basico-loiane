package estrutura_loopings;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fim;

        System.out.print("Montar a tabuada de: ");
        int num = Integer.parseInt(input.nextLine());
        System.out.print("Começar de: ");
        int inicio = Integer.parseInt(input.nextLine());

        do {
            System.out.print("Terminar em: ");
            fim = Integer.parseInt(input.nextLine());

            if (fim<inicio) {
                System.out.println("O fim deve ser maior que o início.");
            }
        } while (fim<inicio);
        
        System.out.printf("Vou montar a tabuada de %d começando em %d e terminando em %d:%n", num,inicio,fim);
        for (int i = inicio; i<=fim; i++) {
            int produto = num*i;          
            System.out.printf("%d X %d = %d%n", num, i, produto);
        }
        input.close();
    }    
}
