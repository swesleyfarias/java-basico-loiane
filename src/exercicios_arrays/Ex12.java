package exercicios_arrays;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int soma = 0;
        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o valor da posição: " + i);
            a[i]=Integer.parseInt(input.nextLine());
            soma+=a[i];            
        }

        System.out.println("Soma de todos os números: " + soma);
        input.close();
    }    
}
