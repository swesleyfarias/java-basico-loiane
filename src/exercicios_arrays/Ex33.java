package exercicios_arrays;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        
        for (int i = 0; i<a.length; i++) {
            boolean primo = true;
            System.out.println("Digite o número: ");
            a[i] = Integer.parseInt(input.nextLine());

            if (a[i]<2) {
                primo = false;
            } else {
                for (int p = 2; p<a[i]; p++) {
                    if (a[i]%p==0) {
                        primo=false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.printf("O número %d é primo.%n", a[i]);
            } else {
                System.out.printf("O número %d não é primo.%n", a[i]);                
            }
        }
        input.close();
    }   
}
