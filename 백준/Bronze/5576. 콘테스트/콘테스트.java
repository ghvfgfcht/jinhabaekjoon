import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main{
	static PriorityQueue<Integer>pq1=new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer>pq2=new PriorityQueue<>(Collections.reverseOrder());
	public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      for(int i=0;i<20;i++) {
    	  if(i<10) {
    		  pq1.add(Integer.parseInt(br.readLine()));
    	  }
    	  else {
    		  pq2.add(Integer.parseInt(br.readLine()));
    	  }
      }
      int pq1_sum=0;
      int pq2_sum=0;
      for(int i=0;i<6;i++) {
    	  if(i<3) {
    		  pq1_sum+=pq1.poll();  
    	  }
    	  else {
    		  pq2_sum+=pq2.poll();
    	  }
      }
      bw.write(pq1_sum+" "+pq2_sum+"\n");
      bw.flush();
      bw.close();
      br.close();
    }
}