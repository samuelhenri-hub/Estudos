package exerciciosIF;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do IPI: ");
        int ipi = sc.nextInt();

        System.out.print("Valor peça 1: ");
        int peca1 = sc.nextInt();

        System.out.print("quantidade de peças 1: ");
        int qntde1 = sc.nextInt();

        System.out.print("Valor peça 2: ");
        int peca2 = sc.nextInt();

        System.out.print("quantidade peça 2: ");
        int qntde2 = sc.nextInt();

        int valorTotal = (peca1 * qntde1 + peca2 * qntde2) * (ipi/100 + 1);
        System.out.print(valorTotal);

        sc.close();
    }
}
