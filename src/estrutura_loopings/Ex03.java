package estrutura_loopings;

import java.util.Scanner; 

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo;
        char estado_civil;
        boolean valido = false;
        do {
            int cont = 0;
            System.out.println("Digite seu nome (min 3 caracteres): ");
            nome = input.nextLine();
            if (nome.length()>3) {
                cont++;
            } else {
                System.out.println("Nome inválido.");
            }

            System.out.println("Digite sua idade(entre 0 e 150):");
            idade = Integer.parseInt(input.nextLine());
            if (idade>=0 && idade<=150) {
                cont++;
            } else {
                System.out.println("Idade inválida.");
            }

            System.out.println("Digite seu sálario(maior que zero):");
            salario = Double.parseDouble(input.nextLine());
            if (salario>0) {
                cont++;
            } else {
                System.out.println("Sálario inválido.");
            }

            System.out.println("Digite seu sexo(f ou m):");
            sexo = input.nextLine().toLowerCase().charAt(0);
            if (sexo=='m' || sexo=='f') {
                cont++;
            } else {
                System.out.println("Sexo inválido.");
            }

            System.out.println("Digite o seu estado civil(Deve ser s, c, v ou d):");
            estado_civil = input.nextLine().toLowerCase().charAt(0);
            if (estado_civil=='s' || estado_civil=='c' ||  estado_civil=='v' || estado_civil=='d') {
                cont++;
            } else {
                System.out.println("Estado civil inválido.");
            }

            if (cont==5) {
                System.out.println("Login válido!");
                valido=true;
            }  else {
                System.out.println("\nAlguns campos estão inválidos. Tente novamente\n");
            }
            
        } while (!valido);
        input.close();
    }
}
