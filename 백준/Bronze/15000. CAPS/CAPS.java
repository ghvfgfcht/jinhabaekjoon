import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String order[]=br.readLine().split("");
		for(int i=0;i<order.length;i++) {
			order[i]=order[i].toUpperCase();
		}
		for(int i=0;i<order.length;i++) {
			bw.write(order[i]);
		}
		bw.write("\n");
		bw.flush();
		bw.close();
		br.close();
	}
}