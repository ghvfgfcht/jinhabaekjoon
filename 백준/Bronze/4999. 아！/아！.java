import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	static int Jaehwan;
	static int Doctor;
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      Jaehwan=br.readLine().length();
      Doctor=br.readLine().length();
      if(Jaehwan>=Doctor) {
    	  bw.write("go\n");
      }
      else {
    	  bw.write("no\n");
      }
      bw.flush();
      bw.close();
      br.close();
    }
}