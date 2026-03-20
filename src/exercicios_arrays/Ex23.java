package exercicios_arrays;

import java.util.Scanner; 

public class Ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        boolean pares = true;

        for (int i = 0; i<a.length; i++) {
            System.out.println("Digite um valor: ");
            a[i] = Integer.parseInt(input.nextLine());
        }

        System.out.println();
        for (int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
            if (a[i]%2!=0) {
                pares=false;
                break;               
            }  
        }

        if (pares) {
            System.out.println("Número ímpar não encontrado.");
        } else {
            System.out.println("Número ímpar encontrado.");
        }

        input.close();
    }    
}
