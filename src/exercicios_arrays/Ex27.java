package exercicios_arrays;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        char[] b = new char[10];

        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o valor na posição: " + i);
            a[i] = Integer.parseInt(input.nextLine());

            if (a[i]<7) {
                b[i] = 'a';
            } else if (a[i]==7) {
                b[i] = 'b';
            } else if (a[i]>7 && a[i]<10) {
                b[i] = 'c';
            } else if (a[i]==10) {
                b[i] = 'd';
            } else {
                b[i] = 'e';
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