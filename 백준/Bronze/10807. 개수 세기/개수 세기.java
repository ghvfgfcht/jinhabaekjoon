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
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int a=Integer.parseInt(br.readLine());
		HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			int tmp=Integer.parseInt(st.nextToken());
			if(map.containsKey(tmp)) {
				map.put(tmp,map.get(tmp)+1);
			}
			else {
				map.put(tmp, 1);
			}
		}
		if(map.get(a)!=null) {
			bw.write(map.get(a)+"\n");
		}
		else {
			bw.write("0"+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}