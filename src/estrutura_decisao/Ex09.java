package estrutura_decisao;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite o segundo número: ");
        double num2 = Double.parseDouble(input.nextLine());

        System.out.println("Digite o terceiro número: ");
        double num3 = Double.parseDouble(input.nextLine());
           
        double aux;
        if (num1<num2) {
            aux=num1;
            num1=num2;
            num2=aux;
        }
        if (num1<num3) {
            aux=num1;
            num1=num3;
            num3=aux;
        }
        if (num2<num3) {
            aux=num2;
            num2=num3;
            num3=aux;
        }          
             
        System.out.printf("Descrencente: %.1f %.1f %.1f%n", num1, num2,num3);
        input.close();
    }    
}
