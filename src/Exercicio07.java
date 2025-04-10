import java.util.Scanner;

public class Exercicio07 {
    public void executarExercicio07(Scanner scanner) {
        //Diferencie os três comandos de repetição apresentados: while, do-while, for.

        while (true) {
            System.out.println("While repete o bloco de código dentro dele até que a condição usada como parâmetro não seja mais verdadeira, ou o loop seja quebrado.");
            break;
        }

        do {
            System.out.println("Do-while funciona de forma similar, mas a condição é verificada ao final da execução do código, ao invés do início.");
            break;
        } while (true);

        for (int i = 0; i < 1; i++) {
            System.out.println("For repete o bloco de código dentro dele até que a variável usada como contador fuja dos parâmetros estabelecidos para o loop.");
        }
    }
}
