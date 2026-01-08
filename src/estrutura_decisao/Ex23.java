package estrutura_decisao;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = Double.parseDouble(input.nextLine());
        
        double verify = Math.round(num);
        if (num==verify) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }
        input.close();
    }
}