package Java.logicaProgram;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE 3 NUMEROS:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.print("O maior numero é " + num1);
        }
        else if (num2 > num1 &&  num2 > num3) {
            System.out.print("O maior numero é " + num2);
        }
        else {
            System.out.print("O maior numero é " + num3);
        }

        sc.close();
    }
}
