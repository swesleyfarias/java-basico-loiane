package estrutura_decisao;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu sálario: ");
        double salarioInicial = Double.parseDouble(input.nextLine());
        String percentual = "";
        double aumento = salarioInicial*0;

        if (salarioInicial<=280.00) {
            percentual+="20%";
            aumento=0.20;
        } else if (salarioInicial<=700.00) {
            percentual+="15%";
            aumento=0.15;
        } else if (salarioInicial<=1500.00) {
            percentual+="10%";
            aumento=0.10;
        } else {
            percentual+="5%";
            aumento=0.05;
        }       
        double valorAumento = salarioInicial*aumento;
        double salarioNovo = salarioInicial+valorAumento;

        System.out.printf("Sálario antes do reajuste: %.2f%s%n", salarioInicial, "R$");
        System.out.println("Percentual de aumento: " + percentual);
        System.out.printf("O valor do aumento: %.2f%s%n", valorAumento, "R$");
        System.out.printf("Novo sálario: %.2f%s%n", salarioNovo, "R$");
        input.close();
    }    
}
