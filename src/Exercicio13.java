import java.util.Scanner;

public class Exercicio13 {
    public void executarExercicio13(Scanner scanner) {

        //Crie um algoritmo que imprima a tabuada de multiplicação de um número dado pelo usuário
        //(e.g., se o usuário informar o número 10, deve-se exibir a multiplicação do 1 até o 10, no mesmo
        //formato da tabuada)

        double number;

        System.out.print("Insira um número: ");
        number = scanner.nextDouble();

        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
