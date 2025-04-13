import java.util.Scanner;

public class Exercicio21 {
    public void executarExercicio21(Scanner scanner) {

        //Codifique um programa que faça a leitura de três valores reais e verifique se estes valores representam os lados de um triângulo. O programa deve verifica se existe um triângulo com estes
        //lados e imprimir uma mensagem ao usuário informando o resultado. Para verificar a condição de
        //existência de um triângulo, com os lados A, B, e C, qualquer lado deve ser menor que a soma dos
        //outros dois, ou seja:
        //A < B + C e B < A + C e C < A + B

        double a;
        double b;
        double c;

        System.out.println("CONDIÇÃO DE EXISTÊNCIA DE UM TRIÂNGULO");

        System.out.print("Digite o valor do lado A: ");
        a = scanner.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        b = scanner.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        c = scanner.nextDouble();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.printf("Os valores %.2f, %.2f e %.2f\n ", a, b, c);
            System.out.println("representam os lados de um triângulo.");
        } else {
            System.out.printf("Triângulo inexistente! Os valores %.2f, %.2f E %.2f\n", a, b, c);
            System.out.println("não representam os lados de um triângulo.");
        }

    }
}
