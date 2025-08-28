package Java.logicaProgram;

import java.util.Scanner;

public class ifElse1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("DIGITE UM NUMERO: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.printf("%d é um numero par", num);
        }
        else {
            System.out.printf("%d é um numero impar", num);
        }
        sc.close();
    }
}
