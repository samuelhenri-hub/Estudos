package Java.logicaProgram;

import java.util.Scanner;

public class While3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int pos = 0;
        int neg = 0;

        int num = sc.nextInt();

        while (num != 999) {
            num = sc.nextInt();

            if (num >= 0) {
                pos += 1;
            }
            else {
                neg += 1;
            }
        }
        System.out.printf("NUMEROS POSITVOS: %d%n NUMEROS NEGATIVOS: %d%n", pos, neg);

        sc.close();
    }
}
