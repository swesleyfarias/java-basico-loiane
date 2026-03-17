package exercicios_arrays;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int soma = 0;

        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o valor da posição: ");
            a[i]=Integer.parseInt(input.nextLine());

            if (a[i]%5==0) {
                soma+=a[i];
            }
        }

        System.out.println("Soma dos múltiplos: " + soma);
        input.close();
    }    
}
