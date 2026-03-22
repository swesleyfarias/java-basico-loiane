package exercicios_arrays;

import java.util.Scanner;


public class Ex29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];

        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o valor A na posição: " + i);
            a[i] = Integer.parseInt(input.nextLine());
            c[i] = a[i];

            System.out.println("Digite o valor B na posição: " + i);
            b[i] = Integer.parseInt(input.nextLine());
            c[i+10] = b[i];
        }

        System.out.print("\nVetor C: ");
        for (int i = 0; i<c.length; i++) {
           System.out.print(c[i] + " ");
        }

        System.out.println();
        input.close();
    }    
}
