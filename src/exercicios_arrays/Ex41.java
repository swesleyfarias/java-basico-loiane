package exercicios_arrays;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        boolean armazenado = false;

        System.out.println("Digite os 10 números: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(input.nextLine());
        }

        System.out.println("Digite o X para pesquisar se está armazenado ou não: ");
        int x = Integer.parseInt(input.nextLine());

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                armazenado = true;
                break;
            }
        }

        if (armazenado) {
            System.out.printf("%nO número %d está armazenado no vetor A.%n", x);
        } else {
            System.out.printf("%nO número %d não está armazenado no vetor A.%n", x);
        }

        input.close();
    }
}
