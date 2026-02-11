package exerciciosIF;

public class EX {
    public static void main (String[] args) {
        int soma = 0;

        for (int i = 0; i < 500; i++) {
            if (i % 2 != 0 && i % 3 == 0) {
                soma = i + i;
            }
        }
        System.out.print(soma);
    }
}
