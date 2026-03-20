package exercicios_arrays;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        boolean ePalindromo = true;
        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o número na posição: " + i);
            a[i] = Integer.parseInt(input.nextLine());
        }

        for (int i = 0; i<a.length/2; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                ePalindromo=false;
            }
        }

        if (ePalindromo) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
        input.close();
    }   
}
