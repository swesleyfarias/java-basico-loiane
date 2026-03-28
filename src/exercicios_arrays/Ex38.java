package exercicios_arrays;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];

        System.out.println("Digite os números: ");
        for (int i = 0; i<a.length; i++) {
            a[i] = Integer.parseInt(input.nextLine());

        }

        System.out.print("Vetor B: ");
        for (int i = 0; i<b.length; i++ ) {
            int soma = 0;
            for (int j = i; j<10; j++) {
                soma+=a[j];
            }
            b[i] = soma;
            System.out.print(b[i] + " ");
        }
       

        System.out.println();
        input.close();
    }    
}
