package Java.logicaProgram;

import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota da NP1 e NP2");
        int np1 = sc.nextInt(), np2 = sc.nextInt();

        int nota = (np1 + np2) / 2;
        if (nota >= 7) {
            System.out.print("APROVADO!!");
        }
        else if (nota <= 7 && nota >= 5 ) {
            System.out.print("RECUPERAÇÃO");
        }
        else  {
            System.out.print("REPROVADO");
        }
        sc.close();
    }
}
