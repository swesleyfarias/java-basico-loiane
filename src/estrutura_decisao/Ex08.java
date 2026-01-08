package estrutura_decisao;

import java.util.Scanner;
 
public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nome do 1° produto:");
        String produto1 = input.nextLine();
        System.out.println("Preço " + produto1 + ":");
        double preco1 = Double.parseDouble(input.nextLine());

        System.out.println("Nome do 2° produto:");
        String produto2 = input.nextLine();
        System.out.println("Preço " + produto2 + ":");
        double preco2 = Double.parseDouble(input.nextLine());

        System.out.println("Nome do 3° produto:");
        String produto3 = input.nextLine();
        System.out.println("Preço " + produto3 + ":");
        double preco3 = Double.parseDouble(input.nextLine());
        
        double menor = preco1;
        String barato = produto1;
        if (preco2<menor) {
            menor = preco2; 
            barato=produto2;
        } 
        if (preco3<menor) {
            menor=preco3; 
            barato=produto3;
        }             
         
        System.out.println("Produto mais barato: " + barato);
        System.out.printf("Preço: %.2f%s%n", menor, "R$");   
        input.close();
    }   
}
