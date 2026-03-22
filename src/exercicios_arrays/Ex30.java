package exercicios_arrays;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[20];
        int[] b = new int[20];
        int[] c = new int[20];

        System.out.println("Digite os valores de A: ");
        for (int i = 0; i<a.length; i++) {
            a[i] = Integer.parseInt(input.nextLine());

            if (a[i]%2==0) {
                b[i]=a[i];
            } else {
                c[i]=a[i];
            }
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i<b.length; i++) {
            if (b[i]!=0) {
                System.out.print(b[i]+ " ");
            }
            
        }

        System.out.print("\nVetor C: ");
        for (int i = 0; i<c.length; i++) {
            if (c[i]!=0) {
            System.out.print(c[i] + " ");
            }
        }

        System.out.println();
        input.close();
    }       
}
