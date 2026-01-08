package estrutura_decisao;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = input.nextLine().toLowerCase().charAt(0);
        
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra é uma vogal.");
        } else {
            System.out.println("A letra é uma consoante.");
        } 
        input.close();
    }    
}
