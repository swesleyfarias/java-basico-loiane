package estrutura_loopings;

import java.util.Scanner; 

public class Ex24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.println("Digite o N: ");           
            n = Integer.parseInt(input.nextLine());
            if (n<=1) {
                System.out.println("N precisa ser maior que 1.");
            }
        } while (n<=1);

        double soma_nota = 0;

        for (int i = 1; i<=n; i++) {
            System.out.printf("Digite a %d° nota: %n", i);
            double nota = Double.parseDouble(input.nextLine());

            while (nota<0) {
                System.out.println("A nota precisa ser positiva! Digite novamente: ");
                nota = Double.parseDouble(input.nextLine());
            }
            soma_nota+=nota;            
        } 
        
        double media = soma_nota/n;
        System.out.printf("Media: %.2f ",  media);
        input.close();      
    }
}