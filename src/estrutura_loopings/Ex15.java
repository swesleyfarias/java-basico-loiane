package estrutura_loopings;

import java.util.Scanner; 

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o n-ésimo termo: ");
        int n = Integer.parseInt(input.nextLine());
        int n1 = 0;
        int n2 = 1;
        int soma = 0;

        if (n==1) {
            System.out.print(n1+" ");
        } else if (n==2) {
            System.out.print(n1 + ", " + n2 + " ");
        } else if (n>2) {
            System.out.print(n1 + ", " + n2 + ", ");
        } else {
            System.out.println("Não existe.");
        }
        
        for (int i = 0; i<n-2; i++) {           
            soma=n1+n2;           
            n1=n2;
            n2=soma;
            if (i==n-3) {
                System.out.print(soma + " ");
            } else {
                System.out.print(soma + ", ");
            }  
        }
        input.close();
    }    
}
