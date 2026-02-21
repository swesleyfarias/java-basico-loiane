package estrutura_loopings;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        double porcentagem, juros, valor_total, valor_parcela;    
        System.out.print("Digite o valor da divida: ");
        double valor_inicial = Double.parseDouble(input.nextLine());

        int parcelas = 1;
        porcentagem = 0;
        juros = (valor_inicial*porcentagem)/100;
        valor_total = valor_inicial+juros;
        valor_parcela = valor_inicial/parcelas;

        System.out.printf("Valor da dívida  Valor dos juros  Quantidade de parcelas Valor da parcela%n");
        System.out.printf("R$ %.2f %10.2f %14d %23s  %.2f%n",valor_total, juros, parcelas, "R$", valor_parcela);
             
        porcentagem=10;

        for (int i = 3; i<=12; i+=3) {
            parcelas = i;
            juros = (valor_inicial*porcentagem)/100;
            valor_total = valor_inicial+juros;
            valor_parcela = valor_total/parcelas;
            System.out.printf("R$ %.2f %10.2f %14d %23s  %.2f%n",valor_total, juros, parcelas, "R$", valor_parcela);
            porcentagem+=5;
        }

        input.close();
    }
}