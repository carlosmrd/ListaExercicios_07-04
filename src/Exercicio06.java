import java.util.Scanner;

public class Exercicio06 {
    public void executarExercicio06(Scanner scanner) {

        // Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou
        //V-Vespertino ou N- Noturno. Imprima a mensagem “Bom Dia!”, “Boa Tarde!” ou “Boa Noite!”,
        //conforme o caso.

        String turno;

        System.out.println("Escolha o turno em que você estuda: ");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        scanner.nextLine();
        turno = scanner.nextLine().toUpperCase();

        switch (turno) {
            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Opção inválida, insira novamente.");
        }
    }
}
