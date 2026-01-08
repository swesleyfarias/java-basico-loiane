package estrutura_decisao;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o quanto você ganha por hora: ");
        double salarioHora = Double.parseDouble(input.nextLine());

        System.out.println("Digite suas horas trabalhadas por mês: ");
        int horas = Integer.parseInt(input.nextLine());

        double salarioBruto = salarioHora*horas;
        System.out.printf("Sálario bruto: (%.1f * %d)       : R$ %.2f%n", salarioHora, horas, salarioBruto);

        double porcentagem;
        String porcentagemStr;
        if (salarioBruto<=900) {
            porcentagem=0;
            porcentagemStr="Isento";
        } else if (salarioBruto<=1500) {
            porcentagem=0.05;
            porcentagemStr="5%";
        } else if (salarioBruto<=2500) {
            porcentagem=0.10;
            porcentagemStr="10%";
        } else {
            porcentagem=0.20;
            porcentagemStr="20%";
        }
        
        double inss = salarioBruto*0.10;
        double fgts = salarioBruto*0.11;
        double impostoRenda = salarioBruto*porcentagem;
        double totalDescontos = impostoRenda+inss;
        double salarioLiquido = salarioBruto-totalDescontos;

        System.out.printf("(-) IR (%s)              : R$ %.2f%n", porcentagemStr, impostoRenda);
        System.out.printf("(-) INSS (10%%)               : R$ %.2f%n", inss);
        System.out.printf("FGTS (11%%)              : R$ %.2f%n", fgts);
        System.out.printf("Total de descontos              : R$ %.2f%n", totalDescontos);
        System.out.printf("Sálario liquído              : R$ %.2f%n", salarioLiquido);
        input.close();
    }   
}
