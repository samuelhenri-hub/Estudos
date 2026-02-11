package exerciciosIF;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("DIgite seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("DIgite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.printf("%f abaixo do peso", imc);
        }
        else if (imc > 18.5 && imc < 25) {
            System.out.printf("%f peso normal", imc);
        }
        else if (imc > 25 && imc > 30) {
            System.out.printf("%f acima do peso", imc);
        }
        else if (imc > 30) {
            System.out.printf("%f obeso", imc);
        }

        sc.close();
    }
}
