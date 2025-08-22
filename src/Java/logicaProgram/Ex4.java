package Java.logicaProgram;

import java.util.Scanner;

public class Ex4 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros:");
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.printf("%d é maior que %d", num1, num2);
        }
        else if (num1 < num2) {
            System.out.printf("%d é menor que %d", num1, num2);
        }
        else {
            System.out.print("São iguais");
        }

        sc.close();
    }
}
