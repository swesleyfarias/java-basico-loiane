package estrutura_decisao;

import java.util.Scanner;


public class Ex22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int num = Integer.parseInt(input.nextLine());
        
        if (num%2==0) {
            System.out.println("O número " + num + " é par.");
        } else {
            System.out.println("O número " + num + " não é par.");
        }
        input.close();  
    }
}
