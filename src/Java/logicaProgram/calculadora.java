package Java.logicaProgram;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("Cauculadora Java");
        System.out.println("------------------------");

        System.out.println("1 - Calculadora simples 2 - Calculadora funcional");
        int opcaoUSer = sc.nextInt();

        sc.close();
    }
}
