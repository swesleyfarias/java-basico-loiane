package estrutura_sequencial;

import java.util.Scanner; 

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = Double.parseDouble(input.nextLine());
        
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Área do círculo = " + area);
        input.close();
    }
}