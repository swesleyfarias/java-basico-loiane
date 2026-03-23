package exercicios_arrays;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];

        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o número: ");
            a[i] = Integer.parseInt(input.nextLine());

            System.out.print("Pares: ");
            for (int p = 0; p<=a[i]; p++) {
                if (p%2==0) {
                    System.out.print(p+ " ");
                }
            }
            System.out.println();
        }
        input.close();
    }   
}
