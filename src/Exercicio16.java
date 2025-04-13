import java.util.Scanner;

public class Exercicio16 {
    public void executarExercicio16(Scanner scanner) {

        //Seu algoritmo deve ler o sexo e a idade de uma população de 20 pessoas, e, em seguida, informar
        //a média de idade da população masculina e a população feminina,

        int sumMale = 0;
        int sumFemale = 0;
        int sumAgeMale = 0;
        int sumAgeFemale = 0;

        int age;
        String gender;

        double averageAgeMale;
        double averageAgeFemale;

        for (int i = 0; i < 20; i++){
            System.out.print("Insira a idade da " + i + "ª pessoa: ");
            age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Insira o sexo da " + i + "ª pessoa (M/F): ");
            gender = scanner.nextLine().trim().toUpperCase();

            if (gender.equals("M")) {
                sumMale++;
                sumAgeMale += age;
            } else if (gender.equals("F")) {
                sumFemale++;
                sumAgeFemale += age;
            } else {
                System.out.println("Sexo inválido! Por favor, insira M ou F.");
            }

            averageAgeMale = sumMale > 0 ? (double) sumAgeMale / sumMale : 0;
            averageAgeFemale = sumFemale > 0 ? (double) sumAgeFemale / sumFemale : 0;

            System.out.println("Média de idade dos homens: " + averageAgeMale);
            System.out.println("Média de idade das mulheres: " + averageAgeFemale);
        }
    }
}
