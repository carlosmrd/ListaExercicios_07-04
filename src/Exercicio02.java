import java.util.Scanner;

public class Exercicio02 {
    public void executarExercicio02(Scanner scanner) {
        //. Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor
        //que C ou maior igual.

        double a;
        double b;
        double c;

        System.out.print("Insira o valor de A: ");
        a = scanner.nextDouble();

        System.out.print("Insira o valor de B: ");
        b = scanner.nextDouble();

        System.out.print("Insira o valor de C: ");
        c = scanner.nextDouble();

        if ((a + b) < c ) {
            System.out.println("A soma de A+B é igual a " + (a + b) + " e é menor do que C.");
        } else {
            System.out.println("A soma de A+B é igual a " + (a + b) + " e é maior ou igual a C.");
        }
    }
}
