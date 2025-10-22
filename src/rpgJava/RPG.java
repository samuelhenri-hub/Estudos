package rpgJava;

import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("  Bem vindo ao RPG em Java  ");
        System.out.println("----------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.printf("%nCapitulo 1: Declarando variaveis%n");

        System.out.printf("%nNome do Personagem: ");
        String nome = sc.next();

        System.out.print("Idade do personagem: ");
        int idade = sc.nextInt();

        double vida = 100;
        double escudo = 10;
        double ataque = 20;

        sc.close();
    }
}
