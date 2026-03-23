package exercicios_arrays;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];

        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o número: ");
            a[i] = Integer.parseInt(input.nextLine());

            System.out.print("Divisores: ");
            for (int d = 1; d<=a[i]; d++) {
                if (a[i]%d==0) {
                    System.out.print(d + " ");
                }
            }
            System.out.println();
        }
        input.close();
    }    
}
