package estrutura_decisao;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo, menor que 1000: ");
        int num = Integer.parseInt(input.nextLine());
        if (num>=1000 || num <=0) {
            System.out.println("O número tem que ser menor que 1000 e positivo.");
            input.close();
            return;
        } 
        
        int centenas = 0;
        int dezenas = 0;
        int unidades = 0;   
        int aux = num;                           
        unidades= aux%10;
        aux=aux/10;
        dezenas= aux%10;
        aux=aux/10;
        centenas= aux%10;
        aux=aux/10;
        
        String resultado = "";
        
        if (centenas>0) {
            if (centenas==1) {
               resultado += centenas + " Centena";
            } else {
                resultado += centenas + " Centenas";
            }
            if (dezenas>0 && unidades>0) resultado+= ", ";
            else if (dezenas>0||unidades>0) resultado+= " e ";
        }    
        if (dezenas>0) {
            if (dezenas==1) {
               resultado += dezenas + " Dezena";
            } else {
               resultado += dezenas + " Dezenas";
            }            
            if (unidades>0) resultado+= " e ";
        } 
        if (unidades>0) {
            if (unidades==1) {
               resultado += unidades + " Unidade ";
            } else {
               resultado += unidades + " Unidades ";
            }
        }  

        System.out.println(resultado);
        input.close();    
    }
}
