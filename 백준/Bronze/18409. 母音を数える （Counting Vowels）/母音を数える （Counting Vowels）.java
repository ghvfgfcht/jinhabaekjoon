import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      int n=Integer.parseInt(br.readLine());
      String line[]=br.readLine().split("");
      String tmp="";
      int cnt=0;
      for(int i=0;i<n;i++) {
    	  tmp=line[i];
    	  if(tmp.equals("a")||tmp.equals("i")||tmp.equals("u")||tmp.equals("e")||tmp.equals("o")) {
    		  cnt++;
    	  }
      }
      bw.write(cnt+"\n");
      bw.flush();
      bw.close();
      br.close();
    }
}