package exercicios_arrays;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        int cont = 0;

        System.out.println("Digite os números de A: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(input.nextLine());
        }

        System.out.println("Digite os números de B: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(input.nextLine());
        }

        for (int i = 0; i < a.length; i++) {
            boolean repetido = false;
            boolean contemB = false;

            for (int k = 0; k < cont; k++) {
                if (c[k] == a[i]) {
                    repetido = true;
                    break;
                }
            }

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    contemB = true;
                    break;
                }
            }

            if (!contemB && !repetido) {
                c[cont] = a[i];
                cont++;
            }
        }

        System.out.print("Vetor C: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        input.close();
    }
}
