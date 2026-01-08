package estrutura_decisao;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite o segundo número: ");
        double num2 = Double.parseDouble(input.nextLine());

        System.out.println("Digite o terceira número: ");               
        double num3 = Double.parseDouble(input.nextLine());

        double maior = num1;
        if (num2>maior) maior = num2;
        if (num3>maior) maior = num3;    

        System.out.println("Maior: " + maior);       
        input.close();        
    }    
}
