package estrutura_decisao;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o sexo (M OU F) ");
        char sexo = input.nextLine().toUpperCase().charAt(0);
        
        if (sexo=='M') {            
            System.out.println("Masculino");
        } else if (sexo=='F') {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido");
        }
        input.close();
    }    
}
