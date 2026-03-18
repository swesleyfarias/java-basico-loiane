package exercicios_arrays;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int pessoas = 0;

        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o valor da posição: " + i);
            a[i] = Integer.parseInt(input.nextLine());

            if (a[i]>35) {
                pessoas++;
            }
        }

        System.out.println("Pessoas com mais de 35: " + pessoas);
        input.close();
    }    
}
