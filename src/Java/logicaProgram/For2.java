package Java.logicaProgram;

import java.util.Scanner;

public class For2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.printf("%d%n", soma);

        sc.close();
    }
}
