import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{
	static PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      int n=Integer.parseInt(br.readLine());
      StringTokenizer st=new StringTokenizer(br.readLine()," ");
      for(int i=0;i<n;i++) {
    	  pq.add(Integer.parseInt(st.nextToken()));
      }
      bw.write(pq.peek()+"\n");
      bw.flush();
      bw.close();
      br.close();
    }
}