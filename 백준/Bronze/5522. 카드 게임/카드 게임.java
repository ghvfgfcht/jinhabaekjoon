import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int result=0;
        for(int i=0;i<5;i++) {
        	int tmp=Integer.parseInt(br.readLine());
        	result+=tmp;
        }
        bw.write(result+"\n");
    	bw.flush();
    	bw.close();
    	br.close();
    }
}