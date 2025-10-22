package rpgJava;

import java.util.Optional;
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

        int vida = 100;
        int escudo = 10;
        int ataque = 20;

        System.out.printf("%nCapitulo 2: If e elses%n");

        System.out.print("Escolha sua classe");
        System.out.printf("%n 1 - Guerreiro%n 2 - Arqueiro%n 3 - Mago%n");
        int opcaoClasse = sc.nextInt();

        if (opcaoClasse == 1) {
            System.out.printf("%n Bem vindo %s, Voce é um guerreiro", nome);

            vida += 10;
            escudo += 10;
            ataque += 10;
        }

        else if (opcaoClasse == 2) {
            System.out.printf("%n Bem vindo %s, Voce é um arqueiro", nome);

            vida += 5;
            escudo -= 5;
            ataque += 20;
        }

        else if (opcaoClasse == 3) {
            System.out.printf("%n Bem vindo %s, Voce é um mago", nome);

            vida += 20;
            escudo -= 10;
            ataque += 25;
        }

        else {
            System.out.print("Voce nao escolheu nenhuma classe, ERRO");
        }

        System.out.printf("Seus Atributos: %n VIDA: %d%n ESCUDO: %d%n ATAQUE: %d%n", vida, escudo, ataque);

        System.out.printf("%n Voce encontrou um lobo a frente, oque vai fazer?");
        System.out.printf("%n 1 - ATACAR %n 2 - DEFENDER %n 3 - FUGIR %n");
        int opcaoAtaqueLobo = sc.nextInt();

        int vidaLobo = 50;
        int ataqueLobo = 10;

        if (opcaoAtaqueLobo == 1) {

            while (vidaLobo != 0) {
                System.out.print("VOCE ATACOU");
                vidaLobo -= ataque;

                System.out.print("LOBO ATACOU");
                vida -= ataqueLobo;

                if (vida == 0) {
                    System.out.print("GAME OVER");
                }
            }
            System.out.printf("O lobo morreu, sua vida é %d", vida);

        }

        sc.close();
    }
}
