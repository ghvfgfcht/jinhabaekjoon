import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main{ 
	static long a;
	static long b;
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st=new StringTokenizer(br.readLine()," ");
      BigInteger a=new BigInteger(st.nextToken());
      bw.write(a.add(new BigInteger(st.nextToken()))+"\n");
      bw.flush();
      bw.close();
      br.close();
    }
}