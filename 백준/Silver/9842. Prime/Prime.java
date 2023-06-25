import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int cnt=0;
		long prime[]=new long[10000000];
		Arrays.fill(prime, 1);
		prime[0]=prime[1]=0;
		for(int i=2;i<prime.length;i++) {
			for(int j=2;i*j<prime.length;j++) {
				prime[i*j]=0;
			}
		}
		for(int i=2;i<prime.length;i++) {
			if(prime[i]==1) {
				cnt++;
			}
			if(cnt==n) {
				bw.write(i+"\n");
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}