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
		int m=Integer.parseInt(br.readLine());
		if(n<2) {
			bw.write("Before"+"\n");
		}
		else if(n==2) {
			if(m==18) {
				bw.write("Special"+"\n");
			}
			else if(m<18) {
				bw.write("Before"+"\n");
			}
			else {
				bw.write("After"+"\n");
			}
		}
		else {
			bw.write("After"+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}