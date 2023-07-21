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
      for(int i=0;i<n;i++) {
    	  String line[]=br.readLine().split("");
    	  String result=line[0];
    	  for(int j=1;j<line.length;j++) {
    		  if(!line[j-1].equals(line[j])) {
    			  result+=line[j];
    		  }
    	  }
    	  bw.write(result+"\n");
      }
      bw.flush();
      bw.close();
      br.close();
    }
}