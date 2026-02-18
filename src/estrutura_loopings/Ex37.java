package estrutura_loopings;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o código do cliente: ");
        int codigo = Integer.parseInt(input.nextLine());

        System.out.print("Digite a altura: ");
        double altura = Double.parseDouble(input.nextLine());

        System.out.print("Digite o peso: ");
        double peso = Double.parseDouble(input.nextLine());
        
        //Chuva de variáveis..
        double soma_altura = altura;
        double soma_peso = peso;
        double cont = 1;
        double baixo = altura;
        double alto = altura;
        double magro = peso;
        double gordo = peso;
        int cod_baixo = codigo;
        int cod_alto = codigo; 
        int cod_magro = codigo; 
        int cod_gordo = codigo;

        while(true) {           
            System.out.print("\nDigite o código do cliente (0 para sair): ");
            codigo = Integer.parseInt(input.nextLine());
            if (codigo==0) {
                break;
            }

            System.out.print("Digite a altura: ");
            altura = Double.parseDouble(input.nextLine());
            soma_altura+=altura;
            if (altura<baixo) {
                baixo=altura;
                cod_baixo=codigo;
            }
            if (altura>alto) {
                alto=altura;
                cod_alto=codigo;
            }


            System.out.print("Digite o peso: ");
            peso = Double.parseDouble(input.nextLine());
            soma_peso+=peso;
            if (peso<magro) {
                magro=peso;
                cod_magro=codigo;
            }
            if (peso>gordo) {
                gordo=peso;
                cod_gordo=codigo;
            }

            cont++;          
        }

        double media_altura = soma_altura/cont;
        double media_peso = soma_peso/cont;

        System.out.printf("O mais alto: %.2fcm %nCódigo: %d%n",alto, cod_alto);
        System.out.printf("O mais baixo: %.2fcm %nCódigo: %d%n",baixo, cod_baixo);
        System.out.printf("O mais gordo: %.2fkg %nCódigo: %d%n",gordo, cod_gordo);
        System.out.printf("O mais magro: %.2fkg %nCódigo: %d%n",magro, cod_magro);

        System.out.printf("%nMédia alturas: %.2fcm%n",media_altura);
        System.out.printf("Média pesos:  %.2fkg%n", media_peso);

        input.close();
    }    
}