package estrutura_loopings;

import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alunos = 0, maiorAcerto = 0, menorAcerto = 0, notas = 0;
        boolean primeiro = true;

        System.out.print("Digite o gabarito da prova (EX: ABDCAEDBCA): ");
        String gabarito = input.nextLine().toUpperCase();

        while (true) {
            alunos++;
            int acertos = 0;

            System.out.println("Resposta do aluno " + ":");
            for (int i = 0; i<10; i++) {
                System.out.printf("Questão %d: ", i+1);
                char resposta = input.nextLine().toUpperCase().charAt(0);

                if(resposta == gabarito.charAt(i)) {
                    acertos++;
                }
            }

            if (primeiro) {
                maiorAcerto=acertos;
                menorAcerto=acertos;
                primeiro=false;
            } else {
                if (acertos>maiorAcerto) {
                    maiorAcerto=acertos;
                } 
                if (acertos<menorAcerto) {
                    menorAcerto=acertos;
                }
                
            }
            notas+=acertos;
            System.out.print("Outro aluno vai utilizar o sistema? (s/n) ");
            String respostaLoop = input.nextLine().toLowerCase();
            if (respostaLoop.equals("n")) {
                break;
            }            
        }

        double mediaTurma = (double) notas/alunos; 
        System.out.printf("Maior acerto: %d%n", maiorAcerto); 
        System.out.printf("Menor acerto: %d%n", menorAcerto); 
        System.out.printf("Total de alunos: %d%n", alunos); 
        System.out.printf("Média das notas: %.1f%n", mediaTurma); 

        input.close();
    }
}