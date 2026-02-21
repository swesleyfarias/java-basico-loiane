package estrutura_loopings;

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;

        while (true) {
            System.out.print("Digite o número: ");
            num = Integer.parseInt(input.nextLine());
            if (num<0) {
                break;
            }
            if (num>=0 && num<=25) {
                cont1++;
            } else if (num<=50) {
                cont2++;
            } else if (num<=75) {
                cont3++;
            } else if (num<=100) {
                cont4++;
            } else {
                // The rest is silence.
            }
        }

        System.out.printf("%nIntervalo de 0 a 25: %d%n",cont1);
        System.out.printf("Intervalo de 26 a 50: %d%n",cont2);
        System.out.printf("Intervalo de 51 a 75: %d%n",cont3);
        System.out.printf("Intervalo de 76 a 100: %d%n",cont4);
        input.close();
    }    
}
