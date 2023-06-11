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
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		String n=st.nextToken();
		String m=st.nextToken();
		if(n.equals(m)) {
			bw.write("1"+"\n");
		}
		else {
			bw.write("0"+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}