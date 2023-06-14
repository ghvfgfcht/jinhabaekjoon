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
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int cnt=0;
		while(st.hasMoreTokens()) {
			int tmp=Integer.parseInt(st.nextToken());
			if(tmp==n) {
				cnt++;
			}
		}
		bw.write(cnt+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}