import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	static int cnt;
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      cnt=Integer.parseInt(br.readLine());
      for(int i=0;i<cnt;i++) {
    	int tmp=Integer.parseInt(br.readLine());
    	bw.write(tmp+" "+tmp+"\n");
      }
      bw.flush();
      bw.close();
      br.close();
    }
}