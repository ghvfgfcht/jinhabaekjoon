import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		Integer list[]=new Integer[n];
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			list[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(list);
		int num=Integer.parseInt(br.readLine());
		int cnt=0;
		int lt=0;
		int rt=n-1;
		while(lt<rt) {
			int sum=list[lt]+list[rt];
			if(sum==num) {
				cnt++;
				lt++;
			}
			else if(sum<num){
				lt++;
			}
			else {
				rt--;
			}
		}
		bw.write(cnt+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}