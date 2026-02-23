package estrutura_loopings;

import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int canditado1 = 0;
        int canditado2 = 0;
        int canditado3 = 0;
        int canditado4 = 0;
        int votoNulo = 0;
        int votoBranco = 0;
        int votoTotal = 0;

        System.out.println("1, 2, 3, 4 - Votos para os respectivos candidatos");
        System.out.printf("1- Jose %n2- João %n3- Lilly %n4- Yasmin %n5- Voto Nulo %n6- Voto em branco%n%n");
        
        while(true) {
            System.out.printf("Digite seu voto: ");
            int voto = Integer.parseInt(input.nextLine());
            if (voto==0) {
                break;
            }  
                
            switch(voto) {
                case 1:
                    canditado1++;
                    break;
                case 2:
                    canditado2++;
                    break;
                case 3:
                    canditado3++;
                    break;
                case 4:
                    canditado4++;
                    break;
                case 5:
                    votoNulo++;
                    break;
                case 6:
                    votoBranco++;
                    break;
                default:
                    System.out.println("Erro, voto não computado.");                        
                    break;                   
            }
            votoTotal++;
        }
        
        double percentagemNulo = ((double) votoNulo/votoTotal) * 100;
        double percentagemBranco = ((double) votoBranco/votoTotal) * 100;

        System.out.println("Total de votos:");
        System.out.printf("1- Jose: %d%n2- João: %d%n3- Lilly: %d%n4- Yasmin: %d%n5- Voto Nulo: %d%n6- Voto em branco: %d%n",canditado1, 
            canditado2, canditado3, canditado4, votoNulo, votoBranco);
        System.out.printf("Percentagem de votos nulos: %.0f%s  %n", percentagemNulo, "%");
        System.out.printf("Percentagem de votos em branco: %.0f%s %n", percentagemBranco,"%");
        
        input.close();
    }
}