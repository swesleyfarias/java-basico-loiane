package estrutura_sequencial;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");

        double lado = Double.parseDouble(input.nextLine());
        double area = Math.pow(lado,2);

        double dobroArea = area*2;
        System.out.println("Resultado: " + dobroArea);
        input.close();
    }
}
