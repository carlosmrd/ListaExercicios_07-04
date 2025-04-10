import java.util.Scanner;

public class Exercicio05 {
    public void executarExercicio05(Scanner scanner) {

        //Dado um número par determinar se ele é ou não divisível por 3. Se o número for ímpar mostrar
        //se ele é divisível ou não por 5

        double number;

        System.out.print("Insira um número: ");
        number = scanner.nextDouble();

        if (number % 2 == 0) {
            if (number % 3 == 0 ) {
                System.out.printf("O número %.0f é divisível por 3.\n", number);
            } else {
                System.out.printf("O número %.0f não é divisível por 3.\n", number);
            }
        } else {
            if (number % 5 == 0 ) {
                System.out.printf("O número %.0f é divisível por 5.\n", number);
            } else {
                System.out.printf("O número %.0f não é divisível por 5.\n", number);
            }
        }
    }
}
