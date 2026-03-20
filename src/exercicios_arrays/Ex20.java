//Exercício 20 e 21, pdf bugou.

package exercicios_arrays;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] a = new double[20];

        System.out.println("Qual é a cotação do dólar? ");
        double cotacaoDolar = Double.parseDouble(input.nextLine());

        for (int i = 0; i<a.length; i++) {
            a[i] = (i+1) * cotacaoDolar;    
        }

        for (int i = 0; i<a.length; i++) {
            System.out.printf("%d USD: %.2fR$%n", (i+1), a[i]);
        }
        input.close();
    }    
}
