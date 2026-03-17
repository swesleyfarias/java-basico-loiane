package exercicios_arrays;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[a.length];
        
        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o valor da posição: "+ i);
            a[i] = Integer.parseInt(input.nextLine());
            b[i] = a[i]%2;
        }

         System.out.print("\nVetor A: ");
        for (int i = 0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i<b.length; i++) {
            System.out.print(b[i]+" ");
        }
        input.close();
    }    
}
