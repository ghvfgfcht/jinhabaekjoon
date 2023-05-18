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
		int m=Integer.parseInt(st.nextToken());
		int list[]= new int[n];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			list[i]=Integer.parseInt(st.nextToken());
		}
		int lp=0;
		int rp=0;
		int sum=0;
		int cnt=0;
		while(true) {
			if(rp==list.length&&sum<m) {
				break;
			}
			if(sum<m) {
				sum+=list[rp];
				rp++;
			}
			else if(sum>m) {
				sum-=list[lp];
				lp++;
			}
			else if(sum==m) {
				cnt++;
				sum -= list[lp];
				lp++;
			}
		}
		bw.write(cnt+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}