package estrutura_loopings;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = Integer.parseInt(input.nextLine());

        for (int i = 1; i<=num; i++) {
           boolean primo = true;
           int cont = 0;

            for (int p = 1; p<=i; p++) {     
                if (i%p==0) {
                    cont++;
                }    
                if (cont>2) {
                    primo=false;
                }                                        
            }
            if (primo) {
                System.out.println(i);
                }            
        }
        input.close();
    }    
}
