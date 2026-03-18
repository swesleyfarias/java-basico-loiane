package exercicios_arrays;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int somaMenor15 = 0, quantidade = 0;
        double mediaMaior15 = 0, cont = 0;
        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite o valor da posição: " + i);
            a[i] = Integer.parseInt(input.nextLine());

            if (a[i]<15) {
                somaMenor15+=a[i];
            } else if (a[i]==15) {
                quantidade++;
            } else {
                mediaMaior15+=a[i];
                cont++;
            }

        }

        System.out.printf("Soma: %d%n", somaMenor15);
        System.out.printf("Quantidade de elementos: %d%n", quantidade);
    
        if (cont>0) {
            mediaMaior15=mediaMaior15/cont;
            System.out.printf("Média: %.1f%n", mediaMaior15);
        } else {
            System.out.printf("Média: indeterminação%n");
        }

        input.close();
    }    
}
