package estrutura_loopings;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      
        String resposta;
        String erro = "Digite um valor maior que 0.";
        do {       
            double paisA, paisB, taxaA, taxaB;
            do {
                System.out.print("Digite a população do país A: ");
                paisA = Double.parseDouble(input.nextLine()); 
                if (paisA<=0) {
                    System.out.println(erro);
                }
            } while (paisA<=0);                      
                        
            do {
                System.out.print("Digite a taxa (%) de crescimento A: ");
                taxaA = Double.parseDouble(input.nextLine());
                if (taxaA<=0) {
                    System.out.println(erro);
                }
            } while (taxaA<=0);  
            
            do {
                System.out.print("Digite a população do país B: ");  
                paisB = Double.parseDouble(input.nextLine());
                if (paisB<=0) {
                    System.out.println(erro);
                }
            } while (paisB<=0);  
                       
            do {
                System.out.print("Digite a taxa (%) de crescimento B: ");
                taxaB = Double.parseDouble(input.nextLine());
                if (taxaB<=0) {
                    System.out.println(erro);
                }
            } while (taxaB<=0);  

            double aumentoA = (taxaA/100)+1;
            double aumentoB = (taxaB/100)+1;
            int anos = 0;
            while (paisA<=paisB) {
            paisA=paisA*aumentoA;
            paisB=paisB*aumentoB;
            anos++;
        }
            System.out.println("Anos necessários: " + anos);
        
            do {
                System.out.print("Você deseja repetir a operação? (s/n)");
                resposta = input.nextLine();
                if (!resposta.equalsIgnoreCase("n") && !resposta.equalsIgnoreCase("s")) {
                    System.out.println("A resposta deve ser s ou n.");
                }
            } while (!resposta.equalsIgnoreCase("n") && !resposta.equalsIgnoreCase("s"));
            
        } while (!resposta.equalsIgnoreCase("n"));
            
        input.close();
    }
}
