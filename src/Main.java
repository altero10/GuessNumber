import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int number;
        int response;

        Random random = new Random();
        number = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zgadnij liczbę od 1 do 10!");
        do {
            count++;
            System.out.println("Proszę podać liczbę: ");
            response = scanner.nextInt();
            if (response > number) {
                System.out.println("Niestety nie udało się odgadnąć liczby. Jest ona mniejsza.");
            } else if (response < number) {
                System.out.println("Niestety nie udało się odganąć liczby. Jest ona większa.");
            }
        } while (response != number);

        System.out.println("Gratulacje! Udało Ci się odganąć liczbę za " + count + " razem");
      }

}
