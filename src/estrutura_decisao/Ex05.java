package estrutura_decisao;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a segunda nota: ");       
        double nota2 = Double.parseDouble(input.nextLine());

        double media = (nota1+nota2)/2;
        System.out.printf("Média: %.1f%n", media);
        
        if (media==10) {
            System.out.println("Aprovado com distinção.");
        } else if ( media>=7) {
            System.out.println("Aprovado.");
        } else if (media<7) {
            System.out.println("Reprovado.");
        } else {
            System.out.println("Média inválida.");
        }
        input.close();
    }    
}
