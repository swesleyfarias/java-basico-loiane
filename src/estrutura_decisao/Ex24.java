package estrutura_decisao;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.println("Digite o primeiro número: ");
        double num1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite o segundo número: ");
        double num2 = Double.parseDouble(input.nextLine());
        

        System.out.print("Qual operação você deseja realizar? (*,/,+,-) ");
        String operacao = input.nextLine();
        double resultado;
        
        switch (operacao) {
            case "*": 
                resultado = num1*num2;
                System.out.println("Resultado da operação: "  + resultado);
                break;
            case "/":
                if (num2==0) {
                System.out.println("O divisor não pode ser 0.");
                input.close();
                return; 
                }
                resultado = num1/num2;
                System.out.println("Resultado da operação: " + resultado);
                break;
            case "+":
                resultado = num1+num2;
                System.out.println("Resultado da operação: " + resultado);
                break;
            case "-":
                resultado = num1-num2;
                System.out.println("Resultado da operação: " + resultado);    
                break; 
            default:
                System.out.println("Operador inválido.");
                input.close();
                return;    
        }
        
        if (resultado<0) {
            System.out.println("O resultado é negativo.");
        } else {
            System.out.println("O resultado é positivo.");
        }

        if (resultado%1==0) {
            System.out.println("O resultado é inteiro.");
            if (resultado%2==0) {
            System.out.println("O resultado é par.");
            } else {
            System.out.println("O resultado é ímpar.");
            }
        } else {
            System.out.println("O resultado não é inteiro.");
        }
        input.close();
    }
}
