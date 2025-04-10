import java.util.Scanner;

public class Exercicio04 {
    public void executarExercicio04(Scanner scanner) {

        //Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa.
        //• Caso sexo seja “(F)emenino” e estado civil seja “(C)asada”, solicitar o tempo de casada (anos).
        //• As entradas para sexo será: (F)emenino ou (M)asculino; e para estado civil: (C)asado ou
        //(S)olteiro
        //• Ao final, exiba as informações.

        String name;
        char optionGender;
        String gender;
        char optionMaritalStatus;
        String maritalStatus;
        double timeMarried = 0;

        System.out.print("Insira o nome da pessoa: ");
        scanner.nextLine();
        name = scanner.nextLine();

        while (true) {
            System.out.println("Selecione o sexo da pessoa: ");
            System.out.println("M - Masculino");
            System.out.println("F - Feminino");
            optionGender = scanner.next().charAt(0);
            if (optionGender == 'M') {
                gender = "masculino";
                break;
            } else if (optionGender == 'F') {
                gender = "feminino";
                break;
            } else {
                System.out.println("Opção inválida. Insira novamente.");
            }
        }

        while (true) {
            System.out.println("Selecione o estado civil da pessoa");
            System.out.println("S - Solteiro(a)");
            System.out.println("C - Casado(a)");
            optionMaritalStatus = scanner.next().charAt(0);
            if (optionMaritalStatus == 'C') {
                maritalStatus = "casado(a)";
                break;
            } else if (optionMaritalStatus == 'S'){
                maritalStatus = "solteiro(a)";
                break;
            } else {
                System.out.println("Opção inválida. Insira novamente.");
            }
        }

        if (optionMaritalStatus == 'C') {
            System.out.print("Quantos anos de casado? ");
            timeMarried = scanner.nextDouble();
        }

        System.out.println();
        System.out.printf("O nome da pessoa é %s.\n", name);
        System.out.printf("%s é do sexo %s.\n", name, gender);
        if (optionMaritalStatus == 'C'){
            System.out.printf("%s é %s a %.0f ano(s).\n", name, maritalStatus, timeMarried);
        } else {
            System.out.printf("%s é %s.\n", name, maritalStatus);
        }
    }
}
