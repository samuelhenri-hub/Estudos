package Java.logicaProgram;

import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.print("Voce pode entrar!!");
        } else {
            System.out.print("VOce nao pode entrar");
        }
        sc.close();
    }
}
