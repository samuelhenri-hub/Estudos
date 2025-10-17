package Java.logicaProgram;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("Cauculadora Java");
        System.out.println("------------------------");

        System.out.println("1 - Calculadora simples 2 - Calculadora funcional");
        int opcaoUSer = sc.nextInt();

        if (opcaoUSer == 1) {

            System.out.println("Calculadora simples, selecione a opção: ");
            System.out.printf(" 1 - Par ou impar%n 2 - Positivo ou negativo%n");
            int opcaoSimples = sc.nextInt();

            if (opcaoSimples == 1) {

                System.out.println(" Digite um numero inteiro: ");
                int parImpar = sc.nextInt();

                if (parImpar % 2 == 0) {
                    System.out.printf(" O numero %d é par", parImpar);
                }
                else {
                    System.out.printf(" O numero %d é impar", parImpar);
                }
            }

            else if (opcaoSimples == 2) {
                System.out.println(" Digite um numero: ");
                double positiveNegative = sc.nextDouble();

                if (positiveNegative >= 0) {
                    System.out.printf(" O numero %f é positivo", positiveNegative);
                }
                else {
                    System.out.printf(" O numero %f é negativo", positiveNegative);
                }
            }

            else {
                System.out.println("Escolha uma opção valida");
            }
        }
        else if (opcaoUSer == 2) {

            System.out.println(" Escolha uma opção: ");
            System.out.printf(" 1 - Adição%n 2 - Subtração%n 3 - Multiplicação%n 4 - Divisão%n ");
            int opcaoFuncional = sc.nextInt();

            if (opcaoFuncional == 1) {

                System.out.println("Digite um numero(para de somar quando 0 é digitado)");
                double num = sc.nextInt();
                double soma = 0;

                while (num != 0) {
                    soma = soma + num;
                    num = sc.nextInt();
                }

                System.out.printf("Resultado: %f", soma);
            }

            else if (opcaoFuncional == 2) {

                System.out.println("Digite um numero: ");
                double num = sc.nextDouble();

                System.out.println("Digite outro numero: ");
                double num1 = sc.nextDouble();

                if (num < num1) {
                    System.out.println("ERRO");
                }
                double menos = num - num1;
            }

            else if (opcaoFuncional == 3) {

                System.out.println("Digite um numero: ");
                double num = sc.nextDouble();

                System.out.println("Digite outro numero: ");
                double num1 = sc.nextDouble();

                double vezes = num * num1;
            }
        }
        sc.close();
    }
}
