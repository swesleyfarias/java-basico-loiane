package exercicios_arrays;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[20];
        int[] b = new int[20];
        int posImpares = 0;

        System.out.println("Digite os valores de A: ");
        for (int i = 0; i<a.length; i++) {
            a[i] = Integer.parseInt(input.nextLine());

            if (a[i]%2==0) {
                posImpares++;
            }
        }

        int atualPar = 0;
        int atualImpar = posImpares;

        for (int i = 0; i<a.length; i++) {
            if (a[i]%2==0) {
                b[atualPar] = a[i];
                atualPar++;
            } else {
                b[atualImpar] = a[i];
                atualImpar++;
            }
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i<b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();
        input.close();
    }  
}
