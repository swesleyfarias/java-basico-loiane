package exercicios_arrays;

import java.util.Scanner;


public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int maior = 0, menor = 0, indiceMaior = 0, indiceMenor = 0;

        for (int i = 0; i<a.length;i++) {
            System.out.println("Digite  uma idade: ");
            a[i] = Integer.parseInt(input.nextLine());

            if (i==0) {
                maior = a[i];
                menor = a[i];
            } else {
                if (a[i]<menor) {
                    menor=a[i];
                    indiceMenor=i;
                }
                if (a[i]>maior) {
                    maior=a[i];
                    indiceMaior=i;
                }
            }
        }

        System.out.printf("Maior: %d%n", maior);
        System.out.printf("Posição: %d%n", indiceMaior);
        System.out.printf("\nMenor: %d%n", menor);
        System.out.printf("Posição: %d%n", indiceMenor);
        input.close();
    }    
}
