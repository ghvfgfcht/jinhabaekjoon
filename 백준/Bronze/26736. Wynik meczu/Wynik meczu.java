import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main{ 
	static Map<String, Integer>map=new HashMap<>();
	public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      String line[]=br.readLine().split("");
      for(int i=0;i<line.length;i++) {
    	  String tmp=line[i];
    	  if(map.containsKey(tmp)) {
    		  map.put(tmp, map.get(tmp)+1);
    	  }
    	  else {
    		  map.put(tmp, 1);
    	  }
      }
      if(map.get("A")==null) {
    	  bw.write("0 : "+map.get("B")+"\n");
      }
      else if(map.get("B")==null) {
    	  bw.write(map.get("A")+" : 0\n");
      }
      else {
    	  bw.write(map.get("A")+" : "+map.get("B")+"\n");
      }
      bw.flush();
      bw.close();
      br.close();
    }
}