package estrutura_loopings;

import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cod,quantidade;
        double valor_item;
        double valor_total = 0;

        while (true) {
            System.out.print("Digite o código do produto(para encerrar, digite um número negativo): "); 
            cod = Integer.parseInt(input.nextLine());
            if (cod<0) {
                break;
            }

            switch (cod) {
                case 100:
                    do {
                        System.out.print("Digite a quantidade: ");
                        quantidade = Integer.parseInt(input.nextLine());
                        if (quantidade<=0) {
                            System.out.println("A quantidade precisa ser maior que 0.");
                        }
                    } while (quantidade<=0);
                    
                    valor_item =  quantidade*1.20;
                    System.out.printf("Cachorro quente: R$ %.2f%n%n", valor_item);
                    valor_total+=valor_item;
                    break;

                case 101:
                    do {
                        System.out.print("Digite a quantidade: ");
                        quantidade = Integer.parseInt(input.nextLine());
                        if (quantidade<=0) {
                            System.out.println("A quantidade precisa ser maior que 0.");
                        }
                    } while (quantidade<=0);

                    valor_item =  quantidade*1.30;
                    System.out.printf("Bauru Simples: R$ %.2f%n%n", valor_item);
                    valor_total+=valor_item;
                    break;

                case 102:
                    do {
                        System.out.print("Digite a quantidade: ");
                        quantidade = Integer.parseInt(input.nextLine());
                        if (quantidade<=0) {
                            System.out.println("A quantidade precisa ser maior que 0.");
                        }
                    } while (quantidade<=0);

                    valor_item =  quantidade*1.50;
                    System.out.printf("Bauru com ovo: R$ %.2f%n%n", valor_item);
                    valor_total+=valor_item;
                    break; 

                case 103:
                    do {
                        System.out.print("Digite a quantidade: ");
                        quantidade = Integer.parseInt(input.nextLine());
                        if (quantidade<=0) {
                            System.out.println("A quantidade precisa ser maior que 0.");
                        }
                    } while (quantidade<=0);

                    valor_item =  quantidade*1.20;
                    System.out.printf("Hambúrguer: R$ %.2f%n%n", valor_item);
                    valor_total+=valor_item;
                    break; 

                case 104:
                    do {
                        System.out.print("Digite a quantidade: ");
                        quantidade = Integer.parseInt(input.nextLine());
                        if (quantidade<=0) {
                            System.out.println("A quantidade precisa ser maior que 0.");
                        }
                    } while (quantidade<=0);

                    valor_item =  quantidade*1.30;
                    System.out.printf("Cheeseburguer: R$ %.2f%n%n", valor_item);
                    valor_total+=valor_item;
                    break; 

                case 105:
                    do {
                        System.out.print("Digite a quantidade: ");
                        quantidade = Integer.parseInt(input.nextLine());
                        if (quantidade<=0) {
                            System.out.println("A quantidade precisa ser maior que 0.");
                        }
                    } while (quantidade<=0);

                    valor_item =  quantidade*1.00;
                    System.out.printf("Refrigerante: R$ %.2f%n%n", valor_item);
                    valor_total+=valor_item;
                    break; 

                default:
                    System.out.println("Código inválido.");                              
            }    
        }

        System.out.printf("%nValor total: R$ %.2f%n", valor_total);
        input.close();
    }    
}
