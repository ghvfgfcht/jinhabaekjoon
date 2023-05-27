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
			while(st.hasMoreTokens()) {
				String tmp=st.nextToken();
				for(int j=tmp.length()-1;j>=0;j--) {
					bw.write(tmp.charAt(j));
				}
				bw.write(" ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}