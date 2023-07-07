import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{ 
	static int a[];
	static Integer b[];
	static int S(int n, int a[],Integer b[]) {
		int result=0;
		for(int i=0;i<n;i++) {
			result+=(a[i]*b[i]);
		}
		return result;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		a=new int[n];
		b=new Integer[n];
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			b[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		bw.write(S(n,a,b)+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}