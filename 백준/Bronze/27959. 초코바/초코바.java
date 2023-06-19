import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{ 
	static String word;
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		if(n*100>=m) {
			bw.write("Yes"+"\n");
		}
		else if(n*100<m){
			bw.write("No"+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}