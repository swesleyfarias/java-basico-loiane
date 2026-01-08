package estrutura_sequencial;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a área em m²: ");
        double area = Double.parseDouble(input.nextLine());

        double litros = area/3;
        int latas = (int) litros/18;
        if (litros%area>0) {
            latas++;
        }        
        double preco = latas*80.00;
        
        System.out.println("Latas de tinta: " + latas);
        System.out.printf("Preço: %.2f%s%n", preco , "R$");
        input.close();
    }
}
