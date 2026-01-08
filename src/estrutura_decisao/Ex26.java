package estrutura_decisao;

import java.util.Scanner;


public class Ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos litros você quer? ");
        int litros = Integer.parseInt(input.nextLine());

        System.out.println("Qual é o tipo de gasolina (A-álcool ou G-gasolina) ");
        char tipo = input.nextLine().toUpperCase().charAt(0);

        double valorTipo = 0;
        double desconto = 0;
        
        if (tipo=='G') {
            valorTipo=litros*2.50;
            if (litros<=20) desconto=0.04;
            else desconto= 0.06;            
        } else if (tipo=='A') {
            valorTipo=litros*1.90;
            if (litros<=20) desconto=0.03;
            else desconto= 0.05;            
        } else {
            System.out.println("Tipo inválido.");
            input.close();
            return;
        }

        double valorDesconto = valorTipo*desconto;
        double precoFinal = valorTipo-valorDesconto;
        System.out.printf("Valor a ser pago: %.2fR$%n",precoFinal);

        input.close();       
    }
}
