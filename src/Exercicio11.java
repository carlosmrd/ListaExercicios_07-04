import java.util.Scanner;

public class Exercicio11 {
    public void executarExercicio11(Scanner scanner) {

        //Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem pares.
        //Termine a leitura se o usuário digitar zero (0).

        int number;
        int evenValue = 0;
        int evenNumbers = 0;
        double average;

        do {
            System.out.print("Digite um número (0 para encerrar): ");
            number = scanner.nextInt();

            if (number != 0 && number % 2 == 0) {
                evenValue += number;
                evenNumbers++;
            }

        } while (number != 0);

        average = (double) evenValue / evenNumbers;

        System.out.printf("A média dos números pares informados é %.0f.\n", average);

    }
}
