package estrutura_loopings;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean primo = true;
        int cont = 0;

        System.out.print("Digite um número inteiro positivo: ");
        int num = Integer.parseInt(input.nextLine());

        for (int i = 1; i<=num; i++) {
            if (num%i==0) {
                cont++;
            }
            if (cont>2) {
                primo=false;
            } 
        }

        if (primo) {
            System.out.printf("O número %d é primo.%n", num);
        } else {
            System.out.printf("O número %d não é primo.%n", num);
        }

        input.close();
    }    
}
