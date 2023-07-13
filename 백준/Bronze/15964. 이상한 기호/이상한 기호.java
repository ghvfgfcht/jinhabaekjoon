import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{ 
	static int extra_operation(int a, int b) {
		return ((a+b)*(a-b));
	}
   public static void main(String[]args) throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
     StringTokenizer st=new StringTokenizer(br.readLine()," ");
     int a=Integer.parseInt(st.nextToken());
     int b=Integer.parseInt(st.nextToken());
     if(a<=1000&&b<=1000) {
    	 bw.write(extra_operation(a,b)+"\n");
     }
     bw.flush();
     bw.close();
     br.close();
   }
}