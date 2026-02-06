package estrutura_loopings;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eleitores;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;

        do {
            System.out.println("Digite a quantidade de eleitores:");
            eleitores = Integer.parseInt(input.nextLine());

            if (eleitores<1) {
                System.out.println("Obviamente precisa de 1 eleitor. Tente novamente.");
            }
        } while (eleitores<1);

        for (int i = 1; i<=eleitores; i++) {
            System.out.printf("Eleitor %d:", i);
            int voto = Integer.parseInt(input.nextLine());

            while (voto<1 || voto>3) {
                System.out.println("Candidato inválido, tente novamente!");
                voto = Integer.parseInt(input.nextLine());                
            }

            if (voto==1) {
                candidato1++;
            }
            if (voto==2) {
                candidato2++;
            } 
            if (voto==3) {
                candidato3++;
            }

        }

        System.out.println("Números de votos: ");
        System.out.println("Canditado 1: " + candidato1);
        System.out.println("Canditado 2: " + candidato2);
        System.out.println("Canditado 3: " + candidato3);
        input.close();
    }
}
