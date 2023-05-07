import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		String tmp[]=new String[n];
		for(int i=0;i<n;i++) {
			tmp[i]=br.readLine();
		}
		for(int i=1;i<=tmp[0].length();i++) {
			HashSet<String>set=new HashSet<String>();
			for(int j=0;j<tmp.length;j++) {
				String order=tmp[j];
				set.add(order.substring(order.length()-i));
			}
			if(set.size()==n) {
				bw.write(i+"\n");
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}