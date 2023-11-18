import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += sequence[i];
        }
        int currentSum = maxSum;
        for (int i = 1; i <= n - k; i++) {
            currentSum = currentSum - sequence[i - 1] + sequence[i + k - 1];
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
    }
}