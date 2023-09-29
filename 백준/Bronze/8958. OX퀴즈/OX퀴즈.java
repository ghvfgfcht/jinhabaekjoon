import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int testCaseCount = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < testCaseCount; i++) {
            String quizResult = br.readLine();
            int score = 0; 
            int consecutiveO = 0; 
            
            for (int j = 0; j < quizResult.length(); j++) {
                if (quizResult.charAt(j) == 'O') {
                    consecutiveO++; 
                    score += consecutiveO; 
                } else {
                    consecutiveO = 0;
                }
            }
            
            System.out.println(score); 
        }
        
        br.close();
    }
}
