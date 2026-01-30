package estrutura_loopings;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota; 
        do {
            System.out.println("Digite uma nota entre 0 a 10");
            nota = Double.parseDouble(input.nextLine());
            if (nota<0 || nota>10) {
                System.out.println("Digite uma nota válida!\n");
            }           
        } while(nota<0 || nota>10);
        input.close();
    }
}