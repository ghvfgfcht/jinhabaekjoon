import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{ 
	static int x;
	static int l;
	static int r;
   public static void main(String[]args) throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
     StringTokenizer st=new StringTokenizer(br.readLine()," ");
     x=Integer.parseInt(st.nextToken());
     l=Integer.parseInt(st.nextToken());
     r=Integer.parseInt(st.nextToken());
     if(x<l) {
    	 bw.write(l+"\n");
     }
     else if(x>r) {
    	 bw.write(r+"\n");
     }
     else {
    	 bw.write(x+"\n");
     }
     bw.flush();
     bw.close();
     br.close();
   }
}