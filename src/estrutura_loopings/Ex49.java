package estrutura_loopings;

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, denominador = 1;
        double soma = 0;

        do {
            System.out.print("Digite o n:");
            n = Integer.parseInt(input.nextLine());
            if (n<=0) {
                System.out.println("O n precisa ser maior que 0.");
            }
        } while (n<=0);

        System.out.print("S = ");
        for (int i = 1; i<=n; i++) {
            if (i==n) {
                System.out.printf("%d/%d %n",i,denominador);
            } else {
                System.out.printf("%d/%d + ",i,denominador);
            }
            
            soma+= (double) i/denominador;
            denominador+=2;
        }
        System.out.println("Soma: " + soma);
        input.close();
    }    
}
