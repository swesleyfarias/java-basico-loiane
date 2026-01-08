package estrutura_decisao;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIgite valores para 3 lados de um triângulo ");
        double lado1 = Double.parseDouble(input.nextLine());
        double lado2 = Double.parseDouble(input.nextLine());
        double lado3 = Double.parseDouble(input.nextLine());

        String tipo = "Não é um triângulo.";
        if (lado1+lado2>lado3 && lado1+lado3>lado2 && lado2+lado3>lado1) {
            if (lado1==lado2 && lado2==lado3) {
            tipo = "Triângulo equilátero";
         }  else if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
            tipo= "Triângulo isósceles";
         } else {
            tipo= "Triângulo escaleno";
         }
        } 
        
        System.out.println(tipo);
        input.close();
    }
}
