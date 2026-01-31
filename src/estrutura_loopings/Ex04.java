package estrutura_loopings;

public class Ex04 {
    public static void main(String[] args) {
        double paisA = 80000;
        double paisB = 200000;
        int anos = 0;

        while (paisA<=paisB) {
            paisA=paisA*1.03;
            paisB=paisB*1.015;
            anos++;
        }
        System.out.println("Anos necessários: " + anos);
        
    }
}