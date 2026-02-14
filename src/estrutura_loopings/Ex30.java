package estrutura_loopings;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Preço do pão: R$ ");
        double preco_pao = Double.parseDouble(input.nextLine());
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int i = 1; i<=50; i++) {
            double preco_tabela= preco_pao*i;
            System.out.printf( "%d - R$ %.2f%n",i, preco_tabela);
        }
        input.close();
    }    
}
