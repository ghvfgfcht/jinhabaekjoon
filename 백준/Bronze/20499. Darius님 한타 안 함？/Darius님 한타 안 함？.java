import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine(),"/");
		int k=Integer.parseInt(st.nextToken());
		int d=Integer.parseInt(st.nextToken());
		int a=Integer.parseInt(st.nextToken());
		if(k+a<d||d==0) {
			bw.write("hasu"+"\n");
		}
		else {
			bw.write("gosu"+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}