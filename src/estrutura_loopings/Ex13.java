package estrutura_loopings;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a base do número: ");
        double base = Integer.parseInt(input.nextLine());
        System.out.println("Digite o expoente do número: ");
        double expoente = Integer.parseInt(input.nextLine());
        double resultado = 1;
        for (int i = 0; i<expoente ;i++) {
            resultado*=base;
        }
        System.out.println("Resultado: " + resultado);
        input.close();
    }
}