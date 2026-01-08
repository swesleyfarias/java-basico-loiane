package estrutura_decisao;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        int a = Integer.parseInt(input.nextLine());
        if (a==0) {
            System.out.println("A equação não é do segundo grau.");
            input.close();
            return;
        }       
        System.out.println("Digite o valor de b: ");
        double b = Integer.parseInt(input.nextLine());

        System.out.println("Digite o valor de c: ");
        int c = Integer.parseInt(input.nextLine());
        double delta = Math.pow(b, 2) + (-4*a*c); 
        if (delta<0) {
            System.out.println("Delta negativo! A equação não possui raizes reais");         
            input.close();
            return;  
        } 
        double raizDelta = Math.sqrt(delta);
        double raiz1 = (-b + raizDelta) / (2*a);
        double raiz2 = (-b - raizDelta) / (2*a);
        
        System.out.printf("Raiz 2: %.2f%n", raiz2);
        
        if (delta==0) {           
            System.out.printf("Delta igual a zero! A equação  possui apenas uma raiz real: %.2f%n", raiz1);            
        } else {    
            System.out.println("Delta positivo! A equação possui duas raizes");     
            System.out.printf("Raiz 1: %.2f%n", raiz1);   
            System.out.printf("Raiz 2: %.2f%n", raiz2);           
        }
        input.close();
    }
}
