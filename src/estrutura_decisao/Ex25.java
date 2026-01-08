package estrutura_decisao;

import java.util.Scanner;


public class Ex25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        int suspeita = 0;
        String resposta = "";
        System.out.println("Responda com sim ou não.");

        System.out.println("Telefonou para vítima?");
        resposta = input.nextLine().toLowerCase();
        if (resposta.equals("sim")) suspeita++;    
        
        System.out.println("Esteve no local do crime?");
        resposta = input.nextLine().toLowerCase();
        if (resposta.equals("sim")) suspeita++;  

        System.out.println("Mora perto da vítima?");
        resposta = input.nextLine().toLowerCase();
        if (resposta.equals("sim")) suspeita++;  

        System.out.println("Devia para a vítima?");
        resposta = input.nextLine().toLowerCase();
        if (resposta.equals("sim")) suspeita++;  

        System.out.println("Já trabalhou com a vítima?");
        resposta = input.nextLine().toLowerCase();
        if (resposta.equals("sim")) suspeita++;  

        String classificacao =  "";
        if (suspeita==5) classificacao = "Assasino.";
        else if (suspeita>=3) classificacao = "Cúmplice.";
        else if (suspeita==2) classificacao = "Suspeita.";
        else classificacao = "Inocente.";
        
        System.out.println("Classificação: " + classificacao);
        input.close();
    }
}
