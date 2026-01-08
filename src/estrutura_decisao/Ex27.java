package estrutura_decisao;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quantos kg em morango?");
        double morango = Double.parseDouble(input.nextLine());

        System.out.println("Quantos kg em maçã?");
        double maca = Double.parseDouble(input.nextLine());
        double totalKg = morango+maca;
        
        double precoMorango = 0;
        double precoMaca = 0;
        if (morango<=5) precoMorango=morango*2.50;
        else precoMorango=morango*2.20;

        if (maca<=5) precoMaca=maca*1.80;
        else precoMaca=maca*1.50;

        double valorTotal = precoMaca+precoMorango;
        if (totalKg>8 || valorTotal>25.00) {
            valorTotal= valorTotal*0.90;
        }
        System.out.printf("Valor a ser pago: %.2fR$%n", valorTotal);
        input.close();
    }
}
