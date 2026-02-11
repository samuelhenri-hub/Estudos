package exerciciosIF;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valorA = sc.nextInt();
        System.out.print("Digite um valor: ");
        int valorB = sc.nextInt();
        System.out.print("Digite um valor: ");
        int valorC = sc.nextInt();

        int soma = valorA + valorB;

        if (soma < valorC) {
            System.out.print(soma);
        }
        sc.close();
    }
}
