package estrutura_loopings;

public class Ex16 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int soma = 0;
        System.out.print(n1+", " + n2 + ", ");

        while (soma<500) {
            soma=n1+n2;
            n1=n2;
            n2=soma;
            if (soma>500) {
                System.out.print(soma+" ");               
            } else {
                System.out.print(soma+", ");
            }
        }
            
        
    }    
}
