import java.util.Scanner;

public class Exercicio15 {
    public void executarExercicio15(Scanner scanner) {

        //Altere o algoritmo anterior, caso ainda não tenha feito, para que ele impeça o usuário de informar
        //valores negativos, ou, valores acima de 20. Quando isso acontecer o usuário deve ser informado
        //do erro, e perguntado se deseja ou não continuar.

        int height;
        String option;

        while (true) {
            System.out.print("Insira a altura da figura a ser impressa (máximo 20): ");
            height = scanner.nextInt();

            if (height < 0 || height > 20) {
                System.out.print("A altura selecionada é maior que 20 ou negativa. Deseja continuar (S/N)?  ");
                scanner.nextLine();
                option = scanner.nextLine().toUpperCase();
                if (option.equals("S") || option.equals("N")) {
                    break;
                } else {
                    System.out.println("Opção inválida, insira somente S ou N.");
                }
            }
        }

        if (option.equals("S")) {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}