import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main{ 
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      String line="";
      int num=0;
      int cnt=0;
      List<Integer>arr=new ArrayList<>();
      while(true) {
    	  line=br.readLine();
    	  if(line.equals("0")) {
    		  break;
    	  }
    	  StringTokenizer st=new StringTokenizer(line," ");
    	  num=Integer.parseInt(st.nextToken());
    	  for(int i=0;i<num;i++) {
    		  arr.add(Integer.parseInt(st.nextToken()));
    	  }
    	  cnt++;
    	  bw.write("Case "+cnt+": Sorting... done!\n");
    	  arr.clear();
      }
      bw.flush();
      bw.close();
      br.close();
    }
}