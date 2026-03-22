package exercicios_arrays;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[a.length];

        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o valor na posição: " + i);
            a[i]  =  Integer.parseInt(input.nextLine());

            b[b.length - 1 - i] =  a[i];
        }

        System.out.print("Vetor B:");
        for (int i = 0; i<b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();
        input.close();
    }    
}
