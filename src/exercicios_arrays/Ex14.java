package exercicios_arrays;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        double impares = 0;
        double cont = 0;
        double media = 0;

        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o valor da posição: " + i);
            a[i]=Integer.parseInt(input.nextLine());
            
            if (a[i]%2!=0) {
                cont++;
                impares+=a[i];
            }
        }
        if (cont>0) {
            media = impares/cont;
            System.out.printf("Média aritmética: %.2f", media);
        } else {
            System.out.println("Indeterminação.");
        }

        input.close();
    }
}
