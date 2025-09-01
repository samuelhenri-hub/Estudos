package Java.logicaProgram;

import java.util.Scanner;

public class While2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int soma = 0;
        int num = sc.nextInt();


        while (num != 0) {
            soma += num;
            num = sc.nextInt();
        }
        System.out.print("RESULTADO: " + soma );

        sc.close();
    }
}
