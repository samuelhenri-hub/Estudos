package Java.logicaProgram;

import java.util.Scanner;

public class For1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            int tab = num * i;
            System.out.printf("%d * %d = %d%n", num, i, tab);
        }

        sc.close();
    }
}
