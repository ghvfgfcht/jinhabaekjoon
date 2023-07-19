import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main{ 
	static int n;
	static int l;
	static int concent[];
	static List<Integer>arr=new ArrayList<>();
	static int cnt;
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st=new StringTokenizer(br.readLine()," ");
      n=Integer.parseInt(st.nextToken());
      l=Integer.parseInt(st.nextToken());
      concent=new int[1000000];
      st=new StringTokenizer(br.readLine()," ");
      for(int i=0;i<n;i++) {
    	  concent[i]=Integer.parseInt(st.nextToken());
      }
      int sum=0;
      int lt=0;
      int rt=0;
      while(rt<n) {
    	  sum+=concent[rt++];
    	  arr.add(sum);
    	  if(rt-lt>=l) {
    		  sum-=concent[lt++];
    	  }
      }
      for(Integer i:arr) {
    	  if(i>=129&&i<=138) {
    		  cnt++;
    	  }
      }
      bw.write(cnt+"\n");
      bw.flush();
      bw.close();
      br.close();
    }
}