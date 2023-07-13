import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{ 
   static int nlist[];
   static int find_max(int num,int max) {
      if(num>max) {
         return num;
      }
      return max;
   }
   public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st=new StringTokenizer(br.readLine()," ");
      int n=Integer.parseInt(st.nextToken());
      int k=Integer.parseInt(st.nextToken());
      nlist=new int[n];
      st=new StringTokenizer(br.readLine()," ");
      for(int i=0;i<n;i++) {
         nlist[i]=Integer.parseInt(st.nextToken());
      }
      int lt=0;
      int max=Integer.MIN_VALUE; //-2147483648
      // 32 비트에서 int 정수의 범위는 -2,147,483,648 ~ 2,147,483,647이다.
      while(lt<=n-k) {
         int sum=0;
         for(int rt=lt;rt<lt+k;rt++) {
            sum+=nlist[rt];
         }
         max=find_max(sum,max);
         lt++;
      }
      bw.write(max+"\n");
      bw.flush();
      bw.close();
      br.close();
   }
}