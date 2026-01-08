package estrutura_decisao; 

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a segunda nota: ");
        double nota2 = Double.parseDouble(input.nextLine());
        double media = (nota1+nota2)/2;

        String conceito = "";
        String situacao = "Reprovado!";
        
        if (media<=4.0) {
            conceito="E";           
        } else if (media<=6.0) {
            conceito="D";           
        } else if (media<=7.5) {
            conceito="C"; 
            situacao="Aprovado!";
        } else if (media<=9.0) {
            conceito="B";
            situacao="Aprovado!";
        } else {
            conceito="A";
            situacao="Aprovado!";
        }

        System.out.printf("Notas: %.1f e %.1f%n", nota1, nota2);
        System.out.printf("Média: %.1f%n", media);
        System.out.printf("Conceito: %s%n", conceito);
        System.out.printf("Situação: %s%n", situacao);
        input.close();
    }
}