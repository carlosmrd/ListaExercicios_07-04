import java.util.Scanner;

public class Exercicio10 {
    public void executarExercicio10(Scanner scanner) {

        //Escrever um programa que lê 5 valores, um de cada vez, e conta quantos destes valores são
        //negativos, escrevendo esta informação.

        int negatives = 0;
        double value;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Insira o " + i + "º valor: ");
            value = scanner.nextDouble();

            if (value < 0 ) {
                negatives++;
            }
        }

        System.out.println(negatives + " dos números inseridos são negativos.");

    }
}
