package exercicios_arrays;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        double percentualPares, percentualImpares;
        double pares = 0;
        double impares = 0;

        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o valor da posição: " + i);
            a[i]=Integer.parseInt(input.nextLine());

            if (a[i]%2==0) {
                pares++;
            } else {
                impares++;
            }
        }

        percentualImpares= (impares/10) * 100;
        percentualPares= (pares/10) * 100;

        System.out.printf("Percentual dos pares: %.0f%s%n", percentualPares, "%");
        System.out.printf("Percentual dos ímpares: %.0f%s%n", percentualImpares, "%");

        input.close();
    }    
}
