package exerciciosIF;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int years = sc.nextInt();
        System.out.print("Digite sua idade em meses: ");
        int months = sc.nextInt();
        System.out.print("Digite sua idade em dias: ");
        int days = sc.nextInt();

        int yearsInDays = years * 365 + months * 30 + days;

        System.out.printf("%d anos, %d meses e %d dias = %d", years, months, days, yearsInDays);
    }
}
