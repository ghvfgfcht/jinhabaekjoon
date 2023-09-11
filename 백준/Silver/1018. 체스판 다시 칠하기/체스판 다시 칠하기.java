import java.util.Scanner;

public class Main {
    private static int countRepaint(char[][] board, int startX, int startY, char startColor) {
        int repaint = 0;
        char expectedColor = startColor;
        
        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                if (board[i][j] != expectedColor) {
                    repaint++;
                }
                expectedColor = (expectedColor == 'W') ? 'B' : 'W';
            }
            expectedColor = (expectedColor == 'W') ? 'B' : 'W';
        }
        
        return repaint;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); 
        
        char[][] board = new char[N][M];
        
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        
        int minRepaint = Integer.MAX_VALUE;
        
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int repaintW = countRepaint(board, i, j, 'W');
                int repaintB = countRepaint(board, i, j, 'B');
                int minRepaintInSubBoard = Math.min(repaintW, repaintB);
                minRepaint = Math.min(minRepaint, minRepaintInSubBoard);
            }
        }
        
        System.out.println(minRepaint);
        sc.close();
    }
}