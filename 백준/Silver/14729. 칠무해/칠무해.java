import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		float list[]=new float[n];
		for(int i=0;i<n;i++) {
			list[i]=Float.parseFloat(br.readLine());
		}
		Arrays.sort(list);
		for(int i=0;i<7;i++) {
			bw.write(String.format("%.3f", list[i])+"\n");
		}
		bw.flush();
		bw.close(); 
		br.close();
	}
}