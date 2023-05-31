import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine(),"-");
		ArrayList<String>arr=new ArrayList<>();
		String ShortName="";
		while(st.hasMoreTokens()) {
			String tmp=st.nextToken();
			arr.add(tmp);
		}
		int len=arr.size();
		for(int i=0;i<len;i++) {
			String tmp=arr.get(i);
			ShortName+=tmp.charAt(0);
		}
		bw.write(ShortName+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}