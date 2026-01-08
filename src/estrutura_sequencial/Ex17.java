package estrutura_sequencial;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a área em metros: ");
        double metros = Double.parseDouble(input.nextLine());
        double litros = metros/6;
        int latas = (int) litros/18;       
        if (litros%18>0) {
            latas++;           
        }
        double precoLatas = latas*80.00;

        System.out.println("Latas de tinta com 18L: " + latas);
        System.out.printf("Preço 18L: %.2f%s%n", precoLatas, "R$");
        
        int galoes = (int) (litros/3.6);
        if (litros%3.6>0) {
            galoes++;
        }
        double precoGaloes = galoes*25.00;

        System.out.println("Galões com 3,6L: " + galoes);
        System.out.printf("Preço 3,5L: %.2f%s%n", precoGaloes, "R$");

        double litrosMaior = (metros/6)*1.10;
        double sobra = litrosMaior%18;
        int latasMaior = (int) litrosMaior/18;
        
        int galoesMaior= (int) (sobra/3.6);
        if (sobra%3.6>0) {
            galoesMaior++;
        }        
        double precoMaior = (latasMaior*80)+(galoesMaior*25);
        
        System.out.printf("Compre %d latas e %d galões por %.2f%s%n", latasMaior, galoesMaior, precoMaior, "R$");
        input.close();
    }    
}
