import java.util.Scanner;

public class Exercicio03 {
    public void executarExercicio03(Scanner scanner) {

        //Dado um número, mostrar uma mensagem que ele é par e calcular o quadrado de dito número.
        //Se ele é ímpar mostrar a mensagem que é ímpar e calcular o cubo de dito número.

        double number;

        System.out.print("Insira um número: ");
        number = scanner.nextDouble();

        if (number % 2 == 0) {
            System.out.println(number + " é um número par.");
            number = Math.pow(number, 2);
            System.out.println("Ao quadrado ele resulta " + number + ".");
        } else {
            System.out.println(number + " é um número ímpar.");
            number = Math.pow(number, 3);
            System.out.println("Ao cubo ele resulta " + number + ".");
        }
    }
}
