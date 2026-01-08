package estrutura_decisao;

import java.util.Scanner;


public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma data dd/mm/aaaa: ");   

        System.out.print("Dia: ");   
        int dia = Integer.parseInt(input.nextLine());                      
        if (dia>31 || dia<1) {
            System.out.println("Dia inválido.");
            input.close();
            return;
        }
        
        System.out.print("Mês: ");
        int mes = Integer.parseInt(input.nextLine());          
        if (mes<1 || mes>12) {
            System.out.println("Mês inválido.");
            input.close();
            return;
        }
        
        System.out.print("Ano: ");  
        int ano = Integer.parseInt(input.nextLine());
        if (ano<0) {
            System.out.println("Ano inválido.");
            input.close();
            return;
        }

        boolean bissexto = false;
        int limiteDias = 0;
        
        if ((ano%4==0 && ano%100!=0) || (ano%400==0)) {
            bissexto = true;
        } 
        if (mes==2) {
            if (bissexto) limiteDias=29;
        } else limiteDias=28;
               
        if (mes == 1 || mes==3 || mes == 5 || mes==7 || mes == 8 || mes == 10 || mes == 12) {
            limiteDias=31;
        }
        if (mes == 4 || mes==6 || mes == 9 || mes== 11) {
            limiteDias=30;
        }
        if (limiteDias<dia) {
            System.out.println("Data inválida.");     
        } else {
            System.out.println("Data válida."); 
        }                   
        input.close();
    }
}
