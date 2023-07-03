import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());
		int nlist[]=new int[num];
		for(int i=0;i<num;i++) {
			nlist[i]=i+1;
		}
		int cnt=1;
		int sum=1;
		int lt=0;
		int rt=0;
		while(rt<num-1) {
			if(sum<num) {
				rt++;
				sum+=nlist[rt];
			}
			else if(sum==num) {
				cnt++;
				rt++;
				sum+=nlist[rt];
			}
			else {
				sum-=nlist[lt];
				lt++;
			}
		}
		bw.write(cnt+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}