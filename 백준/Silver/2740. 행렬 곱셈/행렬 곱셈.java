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
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int alist[][]=new int[n][k];
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<k;j++) {
				int tmp=Integer.parseInt(st.nextToken());
				alist[i][j]=tmp;
			}
		}
		st=new StringTokenizer(br.readLine()," ");
		int bn=Integer.parseInt(st.nextToken());
		int bk=Integer.parseInt(st.nextToken());
		int blist[][]=new int[bn][bk];
		for(int i=0;i<bn;i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<bk;j++) {
				int tmp=Integer.parseInt(st.nextToken());
				blist[i][j]=tmp;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<bk;j++) {
				int res=0;
				for(int l=0;l<k;l++) {
					res+=alist[i][l]*blist[l][j];
				}
				bw.write(res+" ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}