package estrutura_loopings;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        
        int codigo;
        double altura, peso;

        boolean primeiroCliente = true;
        int cont = 0;
        double soma_altura = 0, soma_peso = 0;
        
        int cod_baixo = 0, cod_alto = 0, cod_gordo = 0, cod_magro = 0;
        double baixo = 0, magro = 0, alto = 0, gordo = 0;

        while(true) {           
            if (primeiroCliente) {
                System.out.print("Digite o código do cliente (0 para sair): ");
            } else {
                System.out.print("\nDigite o código do cliente (0 para sair): ");
            }
            
            codigo = Integer.parseInt(input.nextLine());
            if (codigo==0) {
                break;
            }

            System.out.print("Digite a altura: ");
            altura = Double.parseDouble(input.nextLine());
            
            System.out.print("Digite o peso: ");
            peso = Double.parseDouble(input.nextLine());
           
            if (primeiroCliente) {                 
                 cont = 1;
                 baixo = altura;
                 alto = altura;
                 magro = peso;
                 gordo = peso;
                 cod_baixo = codigo;
                 cod_alto = codigo; 
                 cod_magro = codigo; 
                 cod_gordo = codigo;
                 primeiroCliente = false;
            } else {

            if (altura<baixo) {
                baixo=altura;
                cod_baixo=codigo;
            }
            if (altura>alto) {
                alto=altura;
                cod_alto=codigo;
            }

            if (peso<magro) {
                magro=peso;
                cod_magro=codigo;
            }
            if (peso>gordo) {
                gordo=peso;
                cod_gordo=codigo;
            }            
            }
       
            soma_peso+=peso;
            soma_altura+=altura;
            cont++;          
        }

        if (cont>0) {
            double media_altura = soma_altura/cont;
            double media_peso = soma_peso/cont;

            System.out.printf("O mais alto: %.2fcm %nCódigo: %d%n",alto, cod_alto);
            System.out.printf("O mais baixo: %.2fcm %nCódigo: %d%n",baixo, cod_baixo);
            System.out.printf("O mais gordo: %.2fkg %nCódigo: %d%n",gordo, cod_gordo);
            System.out.printf("O mais magro: %.2fkg %nCódigo: %d%n",magro, cod_magro);

            System.out.printf("%nMédia alturas: %.2fcm%n",media_altura);
            System.out.printf("Média pesos:  %.2fkg%n", media_peso);
        }  else {
            System.out.println("Nenhum cliente registrado.");
        }
            
        input.close();
    }    
}