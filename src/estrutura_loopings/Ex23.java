package estrutura_loopings;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite o N: ");
            num = Integer.parseInt(input.nextLine());
            if (num<1) {
                System.out.println("O N precisa ser maior que 0.");
            }
        } while (num<1);

        int cont_div = 0;
        System.out.printf("Números primos entre 1 e %d:%n", num);

        for (int i = 1; i<=num; i++) {
            int cont = 0;
            
            for (int p = 1; p<=i; p++) {            
                cont_div++;
                if (i%p==0) {
                    cont++;
                }              
            }

            if (cont==2) {
                    System.out.print(i + " ");
                }
        }
        System.out.printf("\nTotal de divisões: %d%n",cont_div );
        input.close();
    }    
}
