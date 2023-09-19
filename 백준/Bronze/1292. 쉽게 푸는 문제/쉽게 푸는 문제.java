
import java.io.IOException;
import java.util.Scanner;

public class Main{ 
    public static void main(String[] args) throws IOException{
    	Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int result = calculateSumInRange(A, B);
        System.out.println(result);
    }

    public static int calculateSumInRange(int A, int B) {
        int sum = 0;
        int currentNumber = 1; 
        int count = 0;        

        for (int i = 1; i <= B; i++) {
            if (count == currentNumber) {
                currentNumber++;
                count = 0;
            }
            if (i >= A) {
                sum += currentNumber;
            }
            count++;
        }

        return sum;
     }
}