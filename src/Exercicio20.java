import java.util.Scanner;

public class Exercicio20 {
    public void executarExercicio20(Scanner scanner) {

        //Escreva um algoritmo que imprima os n primeiros números da sequência de Fibonacci. Ref.:
        //https://pt.wikipedia.org/wiki/Sequ%C3%AAncia_de_Fibonacci, esta referência já tem uma
        //implementação do algoritmo em C, não sugiro copiar, pois o objetivo é aprender a fazer!

        System.out.print("Digite a quantidade de números da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        int primeiro = 0;
        int segundo = 1;

        System.out.print("Sequência de Fibonacci: ");

        for (int i = 0; i < n; i++) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
