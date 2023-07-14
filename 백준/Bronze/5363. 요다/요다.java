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
    	 String line[]=br.readLine().split(" ");
    	 String result="";
    	 for(int j=2;j<line.length;j++) {
    		 result+=line[j]+" ";
    	 }
    	 result+=line[0]+" "+line[1];
    	 bw.write(result+"\n");
     }
     bw.flush();
     bw.close();
     br.close();
   }
}