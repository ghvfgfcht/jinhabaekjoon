import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main{ 
	static Deque<Integer>dq=new ArrayDeque<>();
	static int n;
	static int k;
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st=new StringTokenizer(br.readLine()," ");
      n=Integer.parseInt(st.nextToken());
      k=Integer.parseInt(st.nextToken());
      for(int i=1;i<=n;i++) {
    	  dq.offer(i);
      }
      bw.write("<");
      while(!dq.isEmpty()) {
    	  for(int i=0;i<k-1;i++) {
    		  dq.offerLast(dq.pollFirst());
    	  }
    	  int a=dq.pollFirst();
    	  if(dq.size()>0) {
    		  bw.write(a+", ");
    	  }
    	  else {
    		  bw.write(a+">");  
    	  }
      }
      bw.flush();
      bw.close();
      br.close();
    }
}