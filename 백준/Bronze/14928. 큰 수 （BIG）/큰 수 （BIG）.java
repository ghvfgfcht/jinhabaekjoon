import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        long tmp=0;
        for(int i=0;i<input.length();i++) {
        	tmp=(tmp*10+(input.charAt(i)-'0'))%20000303;
        }
        System.out.println(tmp);
    }
}