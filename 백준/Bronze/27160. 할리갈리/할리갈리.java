import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		HashMap<String, Integer>hg=new HashMap<String, Integer>();
		for(int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			String tmp=st.nextToken();
			int tem=Integer.parseInt(st.nextToken());
			if(hg.containsKey(tmp)) {
				hg.put(tmp,hg.get(tmp)+tem);
			}
			else {
				hg.put(tmp, tem);
			}
		}
		boolean tf=false;
		for(Integer i:hg.values()) {
			if(i==5) {
				tf=true;
			}
		}
		if(tf) {
			bw.write("YES"+"\n");
		}
		else {
			bw.write("NO"+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}