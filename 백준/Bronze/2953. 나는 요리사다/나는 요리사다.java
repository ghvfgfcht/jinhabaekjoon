import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[5][4];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                scores[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        int[] totalScores = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                totalScores[i] += scores[i][j];
            }
        }

        int winnerIndex = 0;
        int maxScore = totalScores[0];

        for (int i = 1; i < 5; i++) {
            if (totalScores[i] > maxScore) {
                maxScore = totalScores[i];
                winnerIndex = i;
            }
        }

        System.out.println((winnerIndex + 1) + " " + maxScore);
    }
}