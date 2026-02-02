package estrutura_loopings;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        System.out.println("Digite 10 números abaixo:");
        for (int i = 0; i<10; i++) {
            int num = Integer.parseInt(input.nextLine());
            if (num%2==0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
        input.close();
    }    
}
