import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(br.readLine());
		int h=a+(c/60);
		int m=b+(c%60);
		if(m>=60) {
			h++;
			m-=60;
		}
		if(h>=24) {
			h-=24;
		}
		bw.write(h+" "+m+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}