package estrutura_decisao;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual carne você deseja? (F-File Duplo, A-Alcatra, P-Picanha)");
        char tipoCarne = input.nextLine().toLowerCase().charAt(0);

        if (tipoCarne !='f' && tipoCarne!='a' && tipoCarne!='p') {
            System.out.println("Não existe esta carne no estoque.");
            input.close();
            return;
        }
        
        System.out.println("Quantidade em kg: ");
        double kg = Double.parseDouble(input.nextLine());
        if (kg<=0) {
            System.out.println("Quantidade deve ser positiva ou maior que 0.");
            input.close();
            return;
        }
        
        System.out.println("Tipo de pagamento (C-Crédito, D-Dinheiro) *CT-Cartão Tabajara leva 5% de desconto*.");
        String tipoPagamento = input.nextLine().toLowerCase();
        if (!tipoPagamento.equals("d") && !tipoPagamento.equals("c")  && !tipoPagamento.equals("d") 
        && !tipoPagamento.equals("ct")) {
            System.out.println("Não temos essa opção de pagamento.");
            input.close();
            return;
        }

        double precoTotal = 0;
        String carne = "";
        if (tipoCarne=='f') {
            if (kg<=5) precoTotal=kg*4.90;
            else precoTotal=kg*5.80;
            carne= "File Duplo";
        }
        
        if (tipoCarne=='a') {
            if (kg<=5) precoTotal=kg*5.90;
            else precoTotal=kg*6.80;
            carne= "Alcatra";
        }
        if (tipoCarne=='p') {
            if (kg<=5) precoTotal=kg*6.90;
            else precoTotal=kg*7.80;
            carne= "Picanha";
        } 
        
        double valorDesconto = 1;       
        String formaPagamento = "";
        if (tipoPagamento.equals("d")) formaPagamento="Dinheiro";
        else if (tipoPagamento.equals("c")) formaPagamento="Crédito";   
        else if (tipoPagamento.equals("ct")) {
            formaPagamento="Cartão Tabajara";
            valorDesconto=precoTotal*0.05;
        }
        double valorFinal = 0;        
              
        System.out.println("Cupom fiscal: ");
        System.out.println("Carne escolhida: " + carne);
        System.out.printf("Quantidade de carne: %.2fkg%n", kg);
        System.out.printf("Preço total: %.2fR$%n", precoTotal);
        System.out.println("Forma de pagamento: " + formaPagamento);

        if (valorDesconto>1) {
            valorFinal = precoTotal-valorDesconto;
            System.out.printf("Valor do desconto: %.2fR$%n", valorDesconto);
            System.out.printf("Valor final: %.2fR$%n", valorFinal);
        } else {
            System.out.println("Valor do desconto: Sem descontos.");
            System.out.printf("Valor final: %.2fR$%n", precoTotal);
        }       
        input.close();
    }    
}
