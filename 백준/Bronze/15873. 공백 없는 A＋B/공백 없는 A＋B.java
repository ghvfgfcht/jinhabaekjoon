import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        if(line.contains("1010")){
            System.out.println(20);
        } else if(line.contains("10")){
            line = line.replaceAll("10", "");
            System.out.println(Integer.parseInt(line) + 10);
        } else {
            System.out.println(Integer.parseInt(line)/10 + Integer.parseInt(line)%10);
        }
    }

}