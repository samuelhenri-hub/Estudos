package Java.logicaProgram;

import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print("É PAR");
        } else {
            System.out.print("É IMPAR");
        }
        sc.close();
    }
}
