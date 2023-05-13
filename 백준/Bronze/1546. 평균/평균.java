import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
	   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	   int n=Integer.parseInt(br.readLine());
	   double a[]=new double[n];
	   StringTokenizer st=new StringTokenizer(br.readLine());
	   for(int i=0;i<n;i++) {
		   a[i]=Integer.parseInt(st.nextToken());
	   }
	   Arrays.sort(a);
	   double sum=0;
	   double max= a[a.length-1];
	   for(int i=0;i<n;i++) {
		   sum+=a[i]/max*100;
	   }
	   System.out.printf("%.3f",sum/n);
	}
  }