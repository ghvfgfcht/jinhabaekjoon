import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		char a[]=br.readLine().toCharArray();
		for(int i=0;i<a.length;i++) {
			if(Character.isUpperCase(a[i])) {
				bw.write((a[i]+"").toLowerCase());
			}
			else {
				bw.write((a[i]+"").toUpperCase());
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}