
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{ 
	static int n;
	static int[] nlist;
	static long k;
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      n=Integer.parseInt(br.readLine());
      nlist=new int[n];
  	  long cnt=0;
      StringTokenizer st=new StringTokenizer(br.readLine()," ");
      for(int i=0;i<n;i++) {
    	  nlist[i]=Integer.parseInt(st.nextToken());
      }
      k=Integer.parseInt(br.readLine());
      int lt=0;
      int rt=0;
      long sum=0;
      while(rt<n) {
    	  sum+=nlist[rt++];
    	  if(sum>k) {
    		  cnt+=(n-rt+1);
    		  sum-=nlist[lt++];
    		  while(sum>k) {
    			  cnt+=(n-rt+1);
    			  sum-=nlist[lt++];
    		  }
    	  }
      }
      bw.write(cnt+"\n");
      bw.flush();
      bw.close();
      br.close();
    }
}