package estrutura_decisao;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite o segundo número: ");
        double num2 = Double.parseDouble(input.nextLine());
        
        if (num1>num2) {
            System.out.println("O número " + num1 + " é maior que o número " + num2);
        } else if (num1==num2) {
            System.out.println("O número " + num1 + " é o mesmo");
        } else {
            System.out.println("O número " + num2 + " é maior que o número " + num1);
        }
       input.close(); 
    }
}