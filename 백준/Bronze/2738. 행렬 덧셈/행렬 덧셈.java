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
		int list[][]=new int[a][b];
		for(int i=0;i<a;i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<b;j++) {
				list[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0;i<a;i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<b;j++) {
				list[i][j]+=Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				bw.write(list[i][j]+" ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}