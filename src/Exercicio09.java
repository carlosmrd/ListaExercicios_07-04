import java.util.Scanner;

public class Exercicio09 {
    public void executarExercicio09(Scanner scanner) {

        //Mostrar os n primeiros números ímpares em ordem decrescente.

        int number;

        System.out.println("Defina a quantidade de números impares");
        number = scanner.nextInt();

        for (int i = (2 * number -1); i >= 1; i -= 2) {
            System.out.printf("%d ", i);
        }

        System.out.println();
    }
}
