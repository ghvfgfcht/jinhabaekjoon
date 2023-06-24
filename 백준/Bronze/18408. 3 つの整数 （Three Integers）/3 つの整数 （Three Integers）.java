import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main{ 
	static Map<String, Integer>map=new HashMap<String, Integer>();
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		map.put("1", 0);map.put("2", 0);
		String abc[]=br.readLine().split(" ");
		for(int i=0;i<3;i++) {
			String tmp=abc[i];
			if(map.containsKey(tmp)) {
				map.put(tmp, map.get(tmp)+1);
			}
		}
		String result=map.get("1")>map.get("2")?"1":"2";
		bw.write(result+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}