package estrutura_loopings;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de veículos: ");
        int veiculos = Integer.parseInt(input.nextLine());
        double media_veiculos = veiculos;
        
        System.out.print("Digite o número de acidentes com vítimas: ");
        int acidentes = Integer.parseInt(input.nextLine());
        int indice_maior = acidentes;
        int indice_menor = acidentes;
        double media_acidentes = 0;
        int cont = 0;
        if (veiculos<2000) {
            media_acidentes+=acidentes;
            cont++;
        }

        System.out.print("Digite o código da cidade: ");
        int cod_maior = Integer.parseInt(input.nextLine());
        int cod_menor = cod_maior;

        for (int i = 1; i<5; i++) {          
            System.out.print("\nDigite o número de veículos: ");
            int veiculos_loop = Integer.parseInt(input.nextLine());
            media_veiculos+=veiculos_loop;
    
            System.out.print("Digite o número de acidentes com vítimas: ");
            int acidentes_loop = Integer.parseInt(input.nextLine());
    
            System.out.print("Digite o código da cidade: ");
            int cod = Integer.parseInt(input.nextLine());
    
            if (veiculos_loop<2000) {
                media_acidentes+=acidentes_loop;
                cont++;
            }
            if (acidentes_loop>indice_maior) {
                indice_maior=acidentes_loop;
                cod_maior=cod;
            }
            if (acidentes_loop<indice_menor) {
                indice_menor=acidentes_loop;
                cod_menor=cod;
            }
        }

        media_veiculos= media_veiculos/5;
        media_acidentes = media_acidentes/cont;

        System.out.printf("%nMaior indice de acidentes: %d%n", indice_maior);
        System.out.printf("Código da cidade: %d%n", cod_maior);

        System.out.printf("%nMenor indice de acidentes: %d%n", indice_menor);
        System.out.printf("Código da cidade: %d%n", cod_menor);

        System.out.printf("%nMédia de acidentes nas cidades com menos de 2000 veículos: %.2f%n", media_acidentes);
        System.out.printf("%nMédia de veículos nas 5 cinco cidades: %.2f%n", media_veiculos);
        input.close();
    }    
}
