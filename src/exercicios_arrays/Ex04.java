package exercicios_arrays;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] a = new double[15];
        double[] b = new double[a.length];

        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o valor da posição: " + i);
            a[i] = Double.parseDouble(input.nextLine());
            b[i] = Math.sqrt(a[i]);
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i<a.length; i++) {
            System.out.printf("%.2f  ",a[i]);
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i<b.length; i++) {
            System.out.printf("%.2f ", b[i]);
        }
        System.out.println();
        input.close();
    }    
}
