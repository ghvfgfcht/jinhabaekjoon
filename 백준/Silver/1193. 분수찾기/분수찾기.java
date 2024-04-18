import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        
        int diagonal = 1;
        while (X > diagonal) {
            X -= diagonal;
            diagonal++;
        }
        
        if (diagonal % 2 == 1) {
            System.out.println((diagonal - X + 1) + "/" + X);
        } else {
            System.out.println(X + "/" + (diagonal - X + 1));
        }
    }
}