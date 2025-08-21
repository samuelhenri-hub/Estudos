package Java.logicaProgram;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("DIgite um numero inteiro: ");
        int num = sc.nextInt();

        if (num > 0 ) {
            System.out.print("POSITIVO");
        } else if (num < 0) {
            System.out.print("NEGATIVO");
        } else {
            System.out.print("ZERO");
        }

        sc.close();
    }
}
