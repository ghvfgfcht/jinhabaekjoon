import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int registrationFeePerTeam = 4000;
        int totalRegistrationFees = n * registrationFeePerTeam;

        System.out.println(totalRegistrationFees);
    }
}