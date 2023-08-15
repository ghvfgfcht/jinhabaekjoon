import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	static int sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	static long pow(int n) {
		long sum=0;
		for(int i=1;i<=n;i++) {
			sum+=Math.pow(i, 3);
		}
		return sum;
	}
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      int n=Integer.parseInt(br.readLine());
      bw.write(sum(n)+"\n"+Math.round(Math.pow(sum(n),2))+"\n"+Math.round(pow(n)));
      bw.flush();
      bw.close();
      br.close();
    }
}