package estrutura_loopings;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário inicial: ");
        double salario = Double.parseDouble(input.nextLine());

        double taxa = 1.5/100;
        salario += salario * taxa;        
        
        for (int i = 1997; i<=2026; i++) {
            taxa = taxa*2;
            salario+= salario*taxa;
            System.out.printf("Ano: %d - Sálario: %.2fR$ %n", i, salario);
        }
        input.close();
    }
}
