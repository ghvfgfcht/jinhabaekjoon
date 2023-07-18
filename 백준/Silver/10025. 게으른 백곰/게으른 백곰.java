import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{ 
	static int n;
	static int k;
	static int ice[];
	static int max=Integer.MIN_VALUE;
	static int gi;
	static int xi;
	static int max_sum=0;
	static int find_max(int num,int max) {
		return (num>max?num:max);
	}
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st=new StringTokenizer(br.readLine()," ");
      n=Integer.parseInt(st.nextToken());
      k=Integer.parseInt(st.nextToken());
      ice=new int[1000001]; //n의 최대가 100,000이므로
      for(int i=0;i<n;i++) {
    	  st=new StringTokenizer(br.readLine()," ");
    	  gi=Integer.parseInt(st.nextToken());
    	  xi=Integer.parseInt(st.nextToken());
    	  ice[xi]=gi;
    	  max=find_max(xi,max);
      }
      int lt=0;
      int rt=0;
      int tmp=0;
      while(rt<=max) {
    	  if(rt>k*2) {
    		  tmp-=ice[lt];
    		  lt++;
    	  }
		  tmp+=ice[rt];
		  max_sum=find_max(tmp,max_sum);
		  rt++;
      }
      bw.write(max_sum+"\n");
      bw.flush();
      bw.close();
      br.close();
    }
}