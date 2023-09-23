import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{ 
    public static void main(String[] args) throws IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	double w=Long.parseLong(st.nextToken());
    	double h=Long.parseLong(st.nextToken());
    	System.out.printf("%.1f",(w*h)/2);
     }
}