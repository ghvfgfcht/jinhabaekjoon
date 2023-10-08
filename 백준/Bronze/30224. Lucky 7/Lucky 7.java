import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        boolean containsSeven = false;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            if (digit == 7) {
                containsSeven = true;
                break;
            }
            number /= 10;
        }

        if (!containsSeven && originalNumber % 7 != 0) {
            System.out.println("0");
        } else if (!containsSeven && originalNumber % 7 == 0) {
            System.out.println("1");
        } else if (containsSeven && originalNumber % 7 != 0) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}