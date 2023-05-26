import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int result=n/5;
		if(n%5>0) {
			result+=1;
			bw.write(result+"\n");
		}
		else {
			bw.write(result+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}