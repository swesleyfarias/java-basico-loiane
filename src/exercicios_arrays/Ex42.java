package exercicios_arrays;

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];

        System.out.println("Digite os 10 números: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(input.nextLine());
        }

        for (int i = 0; i < a.length; i++) {
            for (int v = i + 1; v < a.length; v++) {
                if (a[i] > a[v]) {
                    int aux = a[i];
                    a[i] = a[v];
                    a[v] = aux;
                }
            }
        }

        System.out.print("Vetor A ordenado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        input.close();
    }
}
