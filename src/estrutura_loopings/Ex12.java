package estrutura_loopings;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = Integer.parseInt(input.nextLine());
        for (int i = 1; i<=10; i++) {
            int produto = num*i;
            System.out.println(num + " x " + i + " = " + produto);
        }
        input.close();
    }
}