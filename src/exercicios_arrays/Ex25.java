package exercicios_arrays;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[a.length];

        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o valor na posição: " + i);
            a[i] = Integer.parseInt(input.nextLine());
            if (a[i]%2==0) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }
        }

        System.out.print("Vetor B: ");
        for (int i = 0; i<b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();
        input.close();
    }    
}
