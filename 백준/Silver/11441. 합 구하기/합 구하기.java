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
		int nlist[]=new int[n+1];
		int result=0;
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		for(int i=1;i<=n;i++) {
			nlist[i]+=nlist[i-1]+Integer.parseInt(st.nextToken());
		}
		int m=Integer.parseInt(br.readLine());
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			result=nlist[b]-nlist[a-1];
			bw.write(result+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}