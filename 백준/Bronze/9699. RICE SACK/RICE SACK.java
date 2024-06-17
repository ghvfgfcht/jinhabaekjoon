import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int numberOfCases = Integer.parseInt(br.readLine());
        for (int i = 1; i <= numberOfCases; i++) {
            
            String[] weightsStr = br.readLine().split(" ");
            int[] weights = new int[weightsStr.length];

            for (int j = 0; j < weightsStr.length; j++) {
                weights[j] = Integer.parseInt(weightsStr[j]);
            }

            int maxWeight = weights[0];
            for (int weight : weights) {
                if (weight > maxWeight) {
                    maxWeight = weight;
                }
            }

            System.out.println("Case #" + i + ": " + maxWeight);
        }
    }
}