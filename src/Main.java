import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opt;

        do {
            System.out.println("Menu de exercícios:");
            System.out.println("1 - Exercício 1.");
            System.out.println("2 - Exercício 2.");
            System.out.println("3 - Exercício 3.");
            System.out.println("4 - Exercício 4.");
            System.out.println("5 - Exercício 5.");
            System.out.println("6 - Exercício 6.");
            System.out.println("7 - Exercício 7.");
            System.out.println("8 - Exercício 8.");
            System.out.println("9 - Exercício 9.");
            System.out.println("10 - Exercício 10.");
            System.out.println("11 - Exercício 11.");
            System.out.println("12 - Exercício 12.");
            System.out.println("13 - Exercício 13.");
            System.out.println("14 - Exercício 14.");
            System.out.println("15 - Exercício 15.");
            System.out.println("16 - Exercício 16.");
            System.out.println("17 - Exercício 17.");
            System.out.println("18 - Exercício 18.");
            System.out.println("19 - Exercício 19.");
            System.out.println("20 - Exercício 20.");
            System.out.println("21 - Exercício 21.");
            System.out.println("0 - Sair.");
            System.out.print("Selecione uma opção: ");
            opt = scanner.nextInt();

            switch (opt) {
                case 1: {
                    System.out.println("Iniciando a execução do exercício 1.\n");
                    Exercicio01 ex1 = new Exercicio01();
                    ex1.executarExercicio01(scanner);
                }
                break;
                case 2: {
                    System.out.println("Iniciando a execução do exercício 2.\n");
                    Exercicio02 ex2 = new Exercicio02();
                    ex2.executarExercicio02(scanner);
                }
                break;
                case 3: {
                    System.out.println("Iniciando a execução do exercício 3.\n");
                    Exercicio03 ex3 = new Exercicio03();
                    ex3.executarExercicio03(scanner);
                }
                break;
                case 4: {
                    System.out.println("Iniciando a execução do exercício 4.\n");
                    Exercicio04 ex4 = new Exercicio04();
                    ex4.executarExercicio04(scanner);
                }
                break;
                case 5: {
                    System.out.println("Iniciando a execução do exercício 5.\n");
                    Exercicio05 ex5 = new Exercicio05();
                    ex5.executarExercicio05(scanner);
                }
                break;
                case 6: {
                    System.out.println("Iniciando a execução do exercício 6.\n");
                    Exercicio06 ex6 = new Exercicio06();
                    ex6.executarExercicio06(scanner);
                }
                break;
                case 7: {
                    System.out.println("Iniciando a execução do exercício 7.\n");
                    Exercicio07 ex7 = new Exercicio07();
                    ex7.executarExercicio07(scanner);
                }
                break;
                case 8: {
                    System.out.println("Iniciando a execução do exercício 8.\n");
                    Exercicio08 ex8 = new Exercicio08();
                    ex8.executarExercicio08(scanner);
                }
                break;
                case 9: {
                    System.out.println("Iniciando a execução do exercício 9.\n");
                    Exercicio09 ex9 = new Exercicio09();
                    ex9.executarExercicio09(scanner);
                }
                break;
                case 10: {
                    System.out.println("Iniciando a execução do exercício 10.\n");
                    Exercicio10 ex10 = new Exercicio10();
                    ex10.executarExercicio10(scanner);
                }
                break;
                case 11: {
                    System.out.println("Iniciando a execução do exercício 11.\n");
                    Exercicio11 ex11 = new Exercicio11();
                    ex11.executarExercicio11(scanner);
                }
                break;
                case 12: {
                    System.out.println("Iniciando a execução do exercício 12.\n");
                    Exercicio12 ex12 = new Exercicio12();
                    ex12.executarExercicio12(scanner);
                }
                break;
                case 13: {
                    System.out.println("Iniciando a execução do exercício 13.\n");
                    Exercicio13 ex13 = new Exercicio13();
                    ex13.executarExercicio13(scanner);
                }
                break;
                case 14: {
                    System.out.println("Iniciando a execução do exercício 14.\n");
                    Exercicio14 ex14 = new Exercicio14();
                    ex14.executarExercicio14(scanner);
                }
                break;
                case 15: {
                    System.out.println("Iniciando a execução do exercício 15.\n");
                    Exercicio15 ex15 = new Exercicio15();
                    ex15.executarExercicio15(scanner);
                }
                break;
                case 16: {
                    System.out.println("Iniciando a execução do exercício 16.\n");
                    Exercicio16 ex16 = new Exercicio16();
                    ex16.executarExercicio16(scanner);
                }
                break;
                case 17: {
                    System.out.println("Iniciando a execução do exercício 17.\n");
                    Exercicio17 ex17 = new Exercicio17();
                    ex17.executarExercicio17(scanner);
                }
                break;
                case 18: {
                    System.out.println("Iniciando a execução do exercício 18.\n");
                    Exercicio18 ex18 = new Exercicio18();
                    ex18.executarExercicio18(scanner);
                }
                break;
                case 19: {
                    System.out.println("Iniciando a execução do exercício 19.\n");
                    Exercicio19 ex19 = new Exercicio19();
                    ex19.executarExercicio19(scanner);
                }
                break;
                case 20: {
                    System.out.println("Iniciando a execução do exercício 20.\n");
                    Exercicio20 ex20 = new Exercicio20();
                    ex20.executarExercicio20(scanner);
                }
                break;
                case 21: {
                    System.out.println("Iniciando a execução do exercício 21.\n");
                    Exercicio21 ex21 = new Exercicio21();
                    ex21.executarExercicio21(scanner);
                }
                break;
            }
        } while (opt != -1);

        scanner.close();
    }
}
