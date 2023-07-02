import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	static int nlist[]= new int[10];
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String result=String.valueOf(Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine()));
		for(int i=0;i<result.length();i++) {
			nlist[Integer.parseInt(result.charAt(i)+"")]++;
		}
		for(int i=0;i<nlist.length;i++) {
			bw.write(nlist[i]+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}