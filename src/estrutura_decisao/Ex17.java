package estrutura_decisao;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = Integer.parseInt(input.nextLine());

        if ((ano%4==0 && ano%100!=0) || (ano%400==0)) {
            System.out.println("O ano é bissexto.");
        } else {
            System.out.println("O ano não é bissexto.");
        }
        input.close();
    }
}
