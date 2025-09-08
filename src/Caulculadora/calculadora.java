package Caulculadora;

import java.util.Scanner;

public class calculadora {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("1 PARA SOMA %n2 PARA SUBTRAIR %n3 PARA MULTIPLICAR %n4 PARA DIVIDIR %n ");
        int opcao_User = sc.nextInt();
        int resultado = 0;

        if (opcao_User == 1) {
            System.out.print("DIGITE UM NUMERO: ");
            int num1 = sc.nextInt();

            System.out.print("DIGITE OUTRO NUMERO: ");
            int num2 = sc.nextInt();

            resultado = num1 + num2;
            System.out.print(resultado);
        }
        else if (opcao_User == 2) {
            System.out.print("DIGITE UM NUMERO: ");
            int num1 = sc.nextInt();

            System.out.print("DIGITE OUTRO NUMERO: ");
            int num2 = sc.nextInt();

            resultado = num1 - num2;
            System.out.print(resultado);
        }
        else if (opcao_User == 3) {
            System.out.print("DIGITE UM NUMERO: ");
            int num1 = sc.nextInt();

            System.out.print("DIGITE OUTRO NUMERO: ");
            int num2 = sc.nextInt();

            resultado = num1 * num2;
            System.out.print(resultado);
        }
        else if (opcao_User == 4) {
            System.out.print("DIGITE UM NUMERO: ");
            int num1 = sc.nextInt();

            System.out.print("DIGITE OUTRO NUMERO: ");
            int num2 = sc.nextInt();

            if (num2 == 0) {
                System.out.print("ERRO!! NÃO É DIVISIVEL POR 0");
            }

            resultado = num1 / num2;
            System.out.print(resultado);
        }
        else {
            System.out.print("DIGITE UMA OPÇÃO VALIDA");
        }

        sc.close();
    }
}
