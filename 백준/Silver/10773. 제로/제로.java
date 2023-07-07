import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	//정수가 0일 경우에 지울 수 있는 수가 있음을 보장
   public static void main(String[] args)throws IOException{
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   int k=Integer.parseInt(br.readLine());
	   int tmp=0;
	   int index=-1;
	   int a[]=new int[k];
	   
	   for(int i=0;i<k;i++) {
		   int x=Integer.parseInt(br.readLine());
		   if(x!=0) {
			   index+=1;
			   a[index]=x;
		   }
		   else {
			   a[index]=0;
			   index-=1;
		   }
		   
	   }
	   for(int i=0;i<a.length;i++) {
		   tmp+=a[i];
	   }
	  System.out.println(tmp);
	   
      }
   }