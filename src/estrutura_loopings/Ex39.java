package estrutura_loopings;

import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a altura: ");
        double alto = Double.parseDouble(input.nextLine());
        double baixo = alto;

        System.out.print("Digite o número do aluno: ");
        int num_alto = Integer.parseInt(input.nextLine());
        int num_baixo = num_alto;
             
        for (int i = 1; i<10; i++) {
            System.out.print("Digite a altura: ");
            double altura = Double.parseDouble(input.nextLine());

            System.out.print("Digite o número do aluno: ");
            int num = Integer.parseInt(input.nextLine());

            if (altura>alto) {
                alto=altura;
                num_alto=num;
            } 
            if (altura<baixo) {
                baixo=altura;
                num_baixo=num;
            }           
        }
        System.out.printf("O aluno mais alto: %.2fcm%n",alto);
        System.out.printf("Número: %d%n", num_alto);

        System.out.printf("%nO aluno mais baixo: %.2fcm%n", baixo);
        System.out.printf("Número: %d%n", num_baixo);
        input.close();               
    }   
}
