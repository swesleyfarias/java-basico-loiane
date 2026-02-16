package estrutura_loopings;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite as temperaturas abaixo (999 para sair do programa): ");
        int temp = Integer.parseInt(input.nextLine());
        int maior = temp;
        int menor = temp;
        int soma = temp;
        int cont = 1;

        while(true) {
            temp = Integer.parseInt(input.nextLine());
            if (temp==999) {
                break;
            }
            cont++;
            if (temp>maior) {
                maior=temp;
            } 
            if (temp<menor) {
                menor=temp;
            }
            soma+=temp;
        }
        double media = (double) soma/cont;

        System.out.printf("Maior temperatura: %d%n", maior);
        System.out.printf("Menor temperatura: %d%n", menor);
        System.out.printf("Média das temperaturas: %.2f%n", media);
        input.close();
    }
}
