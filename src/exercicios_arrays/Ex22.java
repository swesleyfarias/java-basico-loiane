package exercicios_arrays;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int cont1 = 0, cont2 = 0;
        double  percentual1, percentual2;

        for (int i = 0; i<a.length; i++) {
            a[i] = (int) Math.round(Math.random() * 1);
            if (a[i]>=1) {
                cont1++;
            } else {
                cont2++;
            }
        }

        percentual1 = (cont1/10.0) * 100;
        percentual2 = (cont2/10.0) * 100;

        System.out.println("Número 1: " + percentual1 + "%");
        System.out.println("Número 2: " + percentual2 + "%");
        input.close();
    }    
}
