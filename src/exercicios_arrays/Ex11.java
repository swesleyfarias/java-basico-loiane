package exercicios_arrays;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int cont = 0;

        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o valor na posição: " + i);
            a[i]=Integer.parseInt(input.nextLine());
            
            if (a[i]%2==0) {
                cont++;
            }
        }

        System.out.println("Quantidade de pares: " + cont);
        input.close();
    }    
}
