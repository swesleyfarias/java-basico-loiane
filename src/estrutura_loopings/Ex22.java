package estrutura_loopings;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite um número inteiro: ");
            num = Integer.parseInt(input.nextLine());

            if (num<1) {
                System.out.println("O número precisa ser ser positivo e maior que 0.");
            }
        } while (num<1);

        int cont = 0;
        for (int i =1; i<=num; i++) {
            if (num%i==0) {
                cont++;
            }
        }
        
        if (cont>2) {
            System.out.printf("O %d não é um número primo. %n",num);
            System.out.print("Números divisíveis: ");
            for (int i = 1; i<=num; i++) {
                if (num%i==0) {
                    System.out.print(i + " ");
                }                
            }
        } else {
            System.out.printf("O %d é um número primo. %n", num);
        }
        input.close();
    }    
}
