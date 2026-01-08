package estrutura_decisao;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu turno (*M* matutino ou *V* Vespertino ou *N* Noturno)");
        char turno = input.nextLine().toUpperCase().charAt(0);
        
        switch (turno) {
            case 'M': System.out.println("Bom dia!"); break;
            case 'V': System.out.println("Boa tarde!"); break;
            case 'N': System.out.println("Boa noite!"); break;
            default: System.out.println("Entrada inválida.");
        }
        input.close();
    }
}
