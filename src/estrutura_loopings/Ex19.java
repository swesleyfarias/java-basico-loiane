package estrutura_loopings;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.println("Digite quantos números serão digitados: ");
            n = Integer.parseInt(input.nextLine());
            if (n<2) {
                System.out.println("N precisa ser maior que 2.");
            }      
        } while (n<2);

        int menor = 0;
        int maior = 0;
        int soma = 0;
        for (int i = 1; i<=n; i++) {
            System.out.printf("Digite o %d° número: %n", i);
            int num = Integer.parseInt(input.nextLine());
             while (num<0 || num>1000) {
                System.out.println("O número precisa estar entre 0 e 1000, digite novamente.");
                num = Integer.parseInt(input.nextLine());
             }    
                                   
            soma+=num;        
            if (i==1) {
                menor=num;
                maior=num;                
            }
            if (num>maior) {
                maior=num;
            }
            if (num<menor) {
                menor=num;
            }          
        }

        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
        System.out.println("Soma dos números: " + soma);
        input.close();
    }
}
