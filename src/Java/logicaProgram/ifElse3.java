package Java.logicaProgram;

import java.util.Scanner;

public class ifElse3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("DIGITE SUA NOTA: ");
        int nota = sc.nextInt();

        if (nota >= 9) {
            System.out.print("VOCE TIROU MB PARABENS!!");
        }
        else if (nota >= 7 && nota < 9) {
            System.out.print("VOCE TIROU B PARABENS!");
        }
        else if (nota >= 6 &&  nota < 9) {
            System.out.print("VOCE TIROU R, PASSOU MAS DA PRA MELHORAR");
        }
        else {
            System.out.print("VOCE TIROU I, REPROVOU!!");
        }

        sc.close();
    }
}
