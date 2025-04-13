import java.util.Scanner;

public class Exercicio17 {
    public void executarExercicio17(Scanner scanner) {

        //Crie um algoritmo que calcule o IMC de uma pessoa, para isso, você deve coletar a altura e
        //o peso do mesmo. Pesquise na internet como o cálculo é realizado, lembre-se de desprezar a
        //diferença entre sexos. Para cada intervalo do IMC existe uma classificação, ela deve ser exibida
        //por seu algoritmo, junto com uma mensagem informativa ao usuário.

        double weight;
        double height;
        double imc;

        System.out.print("Digite seu peso (em kg): ");
        weight = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        height = scanner.nextDouble();

        imc = weight / (height * height);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade grau II");
        } else {
            System.out.println("Classificação: Obesidade grau III (obesidade mórbida)");
        }

    }
}
