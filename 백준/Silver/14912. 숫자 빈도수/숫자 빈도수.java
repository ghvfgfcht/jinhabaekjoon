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
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int cnt=0;
		for(int i=1;i<=n;i++) {
			String tmp=String.valueOf(i);
			char a[]=tmp.toCharArray();
			for(int j=0;j<a.length;j++) {
				if((a[j]+"").equals(String.valueOf(k))) {
					cnt++;
				}
			}
		}
		bw.write(cnt+"\n");
		bw.flush();
		bw.close(); 
		br.close();
	}
}