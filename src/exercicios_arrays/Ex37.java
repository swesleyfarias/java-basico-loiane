package exercicios_arrays;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[15];
        int[] b = new int[15];

        System.out.println("Digite os números: ");
        for (int i = 0; i<a.length; i++) {
            a[i] = Integer.parseInt(input.nextLine());
        }

        for (int i = 0; i<b.length; i++) {
            int fatorial = 1;
            for (int f = 1; f<=a[i]; f++) {
                fatorial=fatorial*f;
            }
            b[i] = fatorial;
            System.out.printf("Fatorial de %d: %d%n", a[i], b[i]);
        }
        input.close();
    }
}