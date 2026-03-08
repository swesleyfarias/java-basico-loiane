package estrutura_loopings;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double soma = 0;

        do {
            System.out.print("Digite o n: ");
            n = Integer.parseInt(input.nextLine());
            if (n<=0) {
                System.out.println("O n precisa ser maior que 0.");
            }
        } while (n<=0);

        System.out.print("H = ");
        for (int i = 1; i<=n; i++) {
            if (i==n) {
                System.out.printf("1/%d %n", i);
            } else {
                System.out.printf("1/%d + ", i);
            }          
            soma+=1.0/i;
        }

        System.out.println("H: " + soma);
        input.close();
    }    
}
