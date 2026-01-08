package estrutura_sequencial;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite 2 números inteiros e um real: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        double real = input.nextDouble();               
        System.out.println();

        int resultado1 = (num1*2)*(num2/2);
        double resultado2 = (num1*3)+ (real);
        double resultado3 = Math.pow(real, 3);
        
        System.out.println("A: " + resultado1);
        System.out.println("B: " + resultado2);
        System.out.println("C: " + resultado3);
        input.close();
    }    
}
