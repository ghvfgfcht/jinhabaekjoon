import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{ 
	static int list[];
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int sum=Integer.parseInt(br.readLine());
		list=new int[n];
		int cnt=0;
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			list[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(list);
		int lt=0;
		while(lt<n) {
			int tmp=list[lt];
			int num=0;
			for(int i=lt+1;i<n;i++) {
				num=tmp+list[i];
				if(num==sum) {
					cnt++;
				}
			}
			lt++;
		}
		bw.write(cnt+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}