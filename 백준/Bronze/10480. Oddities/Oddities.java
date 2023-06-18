import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	static String word;
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			int tmp=Integer.parseInt(br.readLine());
			if(tmp%2==0) {
				bw.write(tmp+" is even"+"\n");
			}
			else {
				bw.write(tmp+" is odd"+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}