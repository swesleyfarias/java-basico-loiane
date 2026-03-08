package estrutura_loopings;

import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        do {
            System.out.print("Digite um número inteiro maior que 0:");
            num = Integer.parseInt(input.nextLine());
            if (num<=0) {
                System.out.println("Digite um número maior que 0.");
            }
        } while (num<=0);

        while (num>0) {
            int resto = num%10;
            System.out.print(resto);
            num=num/10;
        }

        System.out.println();
        input.close();
    }    
}
