package estrutura_sequencial;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do download em MB ");
        double download_Size = Double.parseDouble(input.nextLine());

        System.out.println("Digite a velocidade do download em Mbps: ");
        double download_Speed = Double.parseDouble(input.nextLine());

        double conversorVelocidade = download_Speed/8;
        double minutos = (download_Size/conversorVelocidade) / 60;
       
        if (minutos<1) {
            System.out.printf("O tempo aproximado de download é ~%.1f segundos%n",  minutos*60);
        } else { 
            System.out.printf("O tempo aproximado de download é ~%.2f minutos%n", minutos);
        }
        
        input.close();
    }
}