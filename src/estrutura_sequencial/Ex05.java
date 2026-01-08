package estrutura_sequencial;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor em metros: ");
        double metros = Double.parseDouble(input.nextLine());
        double centimetros = metros*100;
        
        System.out.println("Conversão: " + centimetros + "cm");     
        input.close();        
    }
}