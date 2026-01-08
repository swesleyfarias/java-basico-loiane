package estrutura_decisao;

import java.util.Scanner;


public class Ex20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a segunda nota: ");
        double nota2 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a terceira nota: ");                
        double nota3 = Double.parseDouble(input.nextLine());
        double media = (nota1+nota2+nota3) /3;
        if (media==10) {
            System.out.println("Aprovado com distinção!");
        } else if (media>=7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        } 
        input.close();
    }
}
