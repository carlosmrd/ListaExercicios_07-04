import java.util.Scanner;

public class Exercicio19 {
    public void executarExercicio19(Scanner scanner) {

        //Escreva um programa em Java que lhe permita calcular o fatorial de um número dado pelo usuário.

        int number;
        int result = 1;

        System.out.print("Insira um número para calcular o fatorial: ");
        number = scanner.nextInt();

        for (int i = number; i >= 1; i--) {
            result *= i;
        }

        System.out.println("O fatorial de " + number + " é " + result + ".");
    }
}
