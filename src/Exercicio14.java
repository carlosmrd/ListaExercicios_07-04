import java.util.Scanner;

public class Exercicio14 {
    public void executarExercicio14(Scanner scanner) {

        //Imprima a seguinte figura:
        //∗
        //∗ ∗
        //∗ ∗ ∗
        //∗ ∗ ∗ ∗
        //∗ ∗ ∗ ∗ ∗
        //A altura deve ser determinada pelo usuário. (não ultrapasse 20 linhas

        int height;

        do {
            System.out.println("Insira a altura da figura a ser impressa (máximo 20):");
            height = scanner.nextInt();
        } while (height < 1 || height > 20);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
