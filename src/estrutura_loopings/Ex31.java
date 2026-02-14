package estrutura_loopings;

import java.util.Scanner;

class Ex31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lojas Tabajara");

        while(true) {
            double preco, dinheiro;
            int i = 1;
            double total = 0;

            while (true) {
                System.out.printf("Produto %d: R$", i);
                preco = Double.parseDouble(input.nextLine());
                if (preco==0) {
                    break;
                } else {
                    total+=preco;
                    i++;
                }
            }
            System.out.printf("Total: R$ %.2f%n", total);            

            do {
                System.out.printf("Dinheiro: R$");
                dinheiro = Double.parseDouble(input.nextLine());
                if (dinheiro<total) {
                    System.out.println("Dinheiro insuficiente! O valor deve ser maior que o total.");
                } 
            } while (dinheiro<total);
                
            double troco = dinheiro-total;
            System.out.printf("Troco: R$ %.2f%n", troco);
            System.out.println("\n----Próximo Cliente---");          
        }
    }
}