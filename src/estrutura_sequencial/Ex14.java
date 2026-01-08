package estrutura_sequencial;

import java.util.Scanner;
public class Ex14 {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o peso dos peixes: ");
        double peso = Double.parseDouble(input.nextLine());
        double excesso = 0;
        double multa = 0;

        if (peso>50) {
           excesso = peso - 50;
           multa = excesso*4;
        }        
        
        System.out.printf("Excesso: %.2f%s%n", multa ,"kg");
        System.out.printf("Sua multa: %.2f%s%n", multa ,"R$");
        input.close();
    }
}
