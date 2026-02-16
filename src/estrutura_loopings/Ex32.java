package estrutura_loopings;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fatorial de: ");
        int num = Integer.parseInt(input.nextLine());

        int fatorial = 1;
        System.out.printf("%d! = ",num);
        for (int i = num; i>=1; i--) {
            fatorial*=i;

            if (i==1) {
                System.out.printf("%d = %d%n", i, fatorial);
            } else {
                System.out.printf("%d . ", i);
            }            
        }
        input.close();
    }
}