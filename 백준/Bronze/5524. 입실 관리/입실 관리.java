import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String tmp[]=br.readLine().split("");
			for(int j=0;j<tmp.length;j++) {
				tmp[j]=tmp[j].toLowerCase();
			}
			for(int j=0;j<tmp.length;j++) {
				bw.write(tmp[j]);
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}