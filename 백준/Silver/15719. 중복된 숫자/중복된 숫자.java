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
		int list[]=new int[n];
		for(int i=0;i<n;i++) {
			int tmp=Integer.parseInt(st.nextToken());
			list[tmp]++;
		}
		for(int i=1;i<n;i++) {
			if(list[i]==2) {
				bw.write(i+"\n");
			}
		}
		bw.flush();
		bw.close();
		bw.close();
	}
}