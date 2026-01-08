package estrutura_decisao;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o valor do saque? ");
        int saque = Integer.parseInt(input.nextLine());
        if (saque<10 || saque>600) {
            System.out.println("O valor deve ser entre 10 e 600.");
            input.close();
            return;
        }
        
        int nota100 = 0;
        int nota50 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota1 = 0;
        int aux=saque;     

        nota100=aux/100;
        aux=aux%100;
        
        nota50=aux/50;
        aux=aux%50;

        nota10=aux/10;
        aux=aux%10;

        nota5=aux/5;
        aux=aux%5;

        nota1=aux/1;

        if (nota100>0) {
            if (nota100==1) System.out.println(nota100 + " nota de 100");
            else if (nota100>1) System.out.println(nota100 + " notas de 100");
        }

        if (nota50>0) {
            if (nota50==1) System.out.println(nota50 + " nota de 50");
            if (nota50>1)  System.out.println(nota50 + " notas de 50");
        }

        if (nota10>0) {
            if (nota10==1) System.out.println(nota10 + " nota de 10"); 
            if (nota10>1)  System.out.println(nota10 + " notas de 10"); 
        }

        if (nota5>0) {
            if (nota5==1) System.out.println(nota5 + " uma nota de 5");
            if (nota5>1)  System.out.println(nota5 + " uma notas de 5");
        }

        if (nota1>0) {
            if (nota1==1) System.out.println(nota1 + " nota de 1");
            if (nota1>1)  System.out.println(nota1 + " notas de 1");
        }

        input.close();
    }
}
