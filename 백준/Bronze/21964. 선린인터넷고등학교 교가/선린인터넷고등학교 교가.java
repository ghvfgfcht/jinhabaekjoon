import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char line[];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        line=br.readLine().toCharArray();
        for(int i=n-5;i<n;i++){
            System.out.print(line[i]);
        }
    }
}