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
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			String tmp[]=new String[st.countTokens()];
			for(int j=0;j<tmp.length;j++) {
				tmp[j]=st.nextToken();
			}
			tmp[0]="god";
			for(int j=0;j<tmp.length;j++) {
				bw.write(tmp[j]);
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}