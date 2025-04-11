import java.util.Scanner;

public class Exercicio12 {
    public void executarExercicio12(Scanner scanner) {

        //Criar um algoritmo que imprima a sequência dos 100 primeiros números pares.

        int number = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }
}
