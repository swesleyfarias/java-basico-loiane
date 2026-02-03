package estrutura_loopings;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = Integer.parseInt(input.nextLine());
        int fatorial = 1;

        System.out.print(num+"! = ");     
        for (int i = num; i>=1; i--) {            
            fatorial*=i;

            if (i==1) {
                System.out.print(i);
                System.out.printf(" = %d%n",fatorial);
            } else {
                System.out.print(i+".");
            }
        }
        input.close();
    }
}