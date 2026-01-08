package estrutura_decisao;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double num = Integer.parseInt(input.nextLine());
        
        if (num<0) {
            System.out.println("O número " + num + " é negativo.");
        } else if (num==0) {
            System.out.println("O número " + num + " é neutro.");
        } else {
            System.out.println("O número " + num + " é positivo.");
        }
        input.close();
    }    
}
