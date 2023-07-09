import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{ 
	static int nlist[];
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			int num=Integer.parseInt(br.readLine());
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			nlist=new int[num];
			for(int j=0;j<num;j++) {
				nlist[j]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(nlist);
			bw.write(nlist[0]+" "+nlist[num-1]+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}