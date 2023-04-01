import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	static long dp(int n) {
		long dp[]=new long[n+1];
		dp[0]=1;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				dp[i]+=(dp[j]*dp[i-j-1]);
			}
		}
		return dp[n];
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		long result=dp(n);
		bw.write(result+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}