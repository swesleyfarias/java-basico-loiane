package exercicios_arrays;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Digite os elementos: ");
        for (int i = 0; i<a.length; i++) {
            a[i] = Integer.parseInt(input.nextLine());
        }

        for (int i = 0; i<a.length; i++) {
            System.out.printf("\nTabuada do %d: %n", a[i]);
            for (int t = 1; t<=10; t++) {               
                System.out.printf("%d x %d = %d%n", a[i], t, a[i]*t);
            }
        }
        input.close();
    }    
}
