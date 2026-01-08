package estrutura_sequencial;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sálario por hora: ");
        double salarioHora = Double.parseDouble(input.nextLine());

        System.out.println("Quantas horas trabalhadas no mês: ");
        double horasTrabalhadas = Double.parseDouble(input.nextLine());

        double salarioBruto = salarioHora*horasTrabalhadas;        
        double imposto_Renda = salarioBruto*0.11;
        double inss = salarioBruto*0.08;
        double sindicato = salarioBruto*0.05;
        double descontos = imposto_Renda+inss+sindicato;
        double salarioLiquido = salarioBruto-descontos;

        System.out.printf("Sálario bruto: %.2f%s%n", salarioBruto, "R$");
        System.out.printf("Quanto pagou ao inss: %.2f%s%n", inss, "R$");
        System.out.printf("Quanto pagou ao sindicato : %.2f%s%n", sindicato, "R$");
        System.out.printf("Seu imposto de renda: %.2f%s%n", imposto_Renda, "R$");
        System.out.printf("Total descontos: %.2f%s%n", descontos, "R$");
        System.out.printf("Seu sálario líquido: %.2f%s%n", salarioLiquido, "R$");
        input.close();
    }    
}
