package exercicios_arrays;

public class Ex36 {
    public static void main(String[] args) {
        int[] a = new int[11];

        System.out.print("Vetor A: ");
        for (int i = 0; i<a.length; i++) {
            a[i] =  (int) Math.pow(2,i);
            System.out.print(a[i] + " ");
        }
    }
}
