package estrutura_loopings;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Digite um número inteiro: ");
            int num = Integer.parseInt(input.nextLine());
            while (num<0 || num>16) {
                System.out.println("O número precisa ser positivo e menor que 16! Tente novamente;");
                num = Integer.parseInt(input.nextLine());
            }
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

            System.out.println("Deseja calcular outro fatorial? (s/n)");
            resposta = input.nextLine();
        } while (!resposta.equalsIgnoreCase("n"));    
        input.close();
    }
}