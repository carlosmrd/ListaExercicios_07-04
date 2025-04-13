import java.util.Scanner;

public class Exercicio18 {
    public void executarExercicio18(Scanner scanner) {

        //Os números primos existentes entre os 100 primeiros números naturais não nulos.

        boolean prime;

        for (int number = 2; number <= 100; number++) {
            prime = true;
            for (int i =2; i <= Math.sqrt(number); i++){
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(number + " ");
            }
        }
    }
}
