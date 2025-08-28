package Java.logicaProgram;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE A SENHA");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("TENTE DE NOVO");
            senha = sc.nextInt();
        }
        System.out.print("SENHA CORRETA");

        sc.close();
    }
}
