package exercicios_arrays;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o valor da posição em A: ");
            a[i]= Integer.parseInt(input.nextLine());

            System.out.println("Digite o valor da posição em B: ");
            b[i]= Integer.parseInt(input.nextLine());
            c[i]= a[i]-b[i];
        }

        System.out.print("\nVetor A: ");
        for (int i = 0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i<b.length; i++) {
            System.out.print(b[i]+" ");
        }

        System.out.print("\nVetor C: ");
        for (int i = 0; i<c.length; i++) {
            System.out.print(c[i]+" ");
        }

        System.out.println();
        input.close();
    }    
}
